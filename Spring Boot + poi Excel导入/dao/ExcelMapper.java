package com.wintech.soli.cmsplat.business.excelImport.dao;

import com.wintech.soli.cmsplat.business.excelImport.bean.EmployExcel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by yeguijun on 2018/6/25.
 */
@Mapper
public interface ExcelMapper {
    void addUser(EmployExcel employExcel);
}
