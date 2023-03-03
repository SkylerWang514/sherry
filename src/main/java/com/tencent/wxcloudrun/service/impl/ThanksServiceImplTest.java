package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.WxCloudRunApplication;
import com.tencent.wxcloudrun.service.ThanksService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WxCloudRunApplication.class)
@EnableAutoConfiguration
class ThanksServiceImplTest {

    @Autowired
    ThanksService thanksService;

    @Test
    void getContentByName() {
        System.out.println(thanksService.getContentByName("buzid"));
    }

    @Test
    void getLettersByPosition(){
        for (int i = 0; i < 50; i++)
            System.out.println(thanksService.getLetterByPosition("群舞"));
    }
}