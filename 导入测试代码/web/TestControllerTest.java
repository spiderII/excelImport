package com.wintech.soli.cmsplat.business.excelImport.web;

import com.wintech.soli.cmsplat.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

/**
 * Created by yeguijun on 2018/6/26.
 */
@EnableAutoConfiguration
@Transactional
public class TestControllerTest extends BaseTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void addUser() throws Exception {
        InputStream A= new FileInputStream(new File("E:\\t1.xls"));
        MockMultipartFile firstFile = new MockMultipartFile("file", "E:\\t1.xls", "application/vnd.ms-excel", A);
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mockMvc.perform(MockMvcRequestBuilders.fileUpload("/test/import")
                .file(firstFile)
                .param("some-random", "4"));
    }

}