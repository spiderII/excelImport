package com.wintech.soli.cmsplat.business.excelImport.service.impl;/**
 * Created by yeguijun on 2018/6/25.
 */

import com.wintech.soli.cmsplat.business.excelImport.bean.EmployExcel;
import com.wintech.soli.cmsplat.business.excelImport.dao.ExcelMapper;
import com.wintech.soli.cmsplat.business.excelImport.service.ITestService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: TestServiceImpl
 * @Description:
 * @Author: yeguijun
 * @Date: 2018/6/25 16:50
 * @Version: 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class TestServiceImpl implements ITestService {

    @Autowired
    private ExcelMapper excelMapper;


    @Transactional(readOnly = false,rollbackFor = Exception.class)
    @Override
    public boolean batchImport(String fileName, MultipartFile file) throws Exception {

        boolean notNull = false;
        List<EmployExcel> employList = new ArrayList<EmployExcel>();
        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            throw new Exception("上传文件格式不正确");
        }
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }

        InputStream is = file.getInputStream();

        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        if(sheet!=null){
            notNull = true;
        }
        EmployExcel employ;
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null){
                continue;
            }

            employ = new EmployExcel();


            row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
            String emplName = row.getCell(1).getStringCellValue();

            row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
            String emplNickName = row.getCell(2).getStringCellValue();

            row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
            String emplEmail = row.getCell(3).getStringCellValue();

            row.getCell(4).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer emplGender = row.getCell(4).getCellType();

            row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
            String emplPhone = row.getCell(5).getStringCellValue();

            row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
            String emplDeptJob = row.getCell(6).getStringCellValue();

            row.getCell(7).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer emplIsTgcr = row.getCell(7).getCellType();

            Date emplBirthday;
            if(row.getCell(8).getCellType() !=0){
                throw new Exception("导入失败(第"+(r+1)+"行,入职日期格式不正确或未填写)");
            }else{
                emplBirthday = row.getCell(8).getDateCellValue();
            }

            row.getCell(9).setCellType(Cell.CELL_TYPE_STRING);
            String emplIntroduction = row.getCell(9).getStringCellValue();

            row.getCell(10).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer compId = row.getCell(10).getCellType();

            row.getCell(11).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer emplTopicNum = row.getCell(11).getCellType();


            row.getCell(12).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer roleId = row.getCell(12).getCellType();

            row.getCell(14).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer emplTopicReport = row.getCell(14).getCellType();

            row.getCell(15).setCellType(Cell.CELL_TYPE_NUMERIC);
            Integer emplRebirtNum = row.getCell(15).getCellType();

            row.getCell(16).setCellType(Cell.CELL_TYPE_STRING);
            String emplIconPath = row.getCell(16).getStringCellValue();

            employ.setEmplName(emplName);
            employ.setEmplNickName(emplNickName);
            employ.setEmplEmail(emplEmail);
            employ.setEmplGender(emplGender);
            employ.setEmplPhone(emplPhone);
            employ.setEmplDeptJob(emplDeptJob);
            employ.setEmplIsTgcr(emplIsTgcr);
            employ.setEmplBirthday(emplBirthday);
            employ.setEmplIntroduction(emplIntroduction);
            employ.setCompId(compId);
            employ.setRoleId(roleId);
            employ.setEmplTopicNum(emplTopicNum);
            employ.setEmplTopicReport(emplTopicReport);
            employ.setEmplRebirtNum(emplRebirtNum);
            employ.setEmplIconPath(emplIconPath);

            employList.add(employ);
        }
        for (EmployExcel userResord : employList) {
            excelMapper.addUser(userResord);
        }
        return notNull;
    }
}
