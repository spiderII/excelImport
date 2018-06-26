package com.wintech.soli.cmsplat.business.excelImport.service;/**
 * Created by yeguijun on 2018/6/25.
 */

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: ITestService
 * @Description:
 * @Author: yeguijun
 * @Date: 2018/6/25 16:50
 * @Version: 1.0.0
 */
public interface ITestService {
    boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
