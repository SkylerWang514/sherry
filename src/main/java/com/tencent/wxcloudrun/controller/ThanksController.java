package com.tencent.wxcloudrun.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.tencent.wxcloudrun.dto.Result;
import com.tencent.wxcloudrun.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-wxcloudrun
 * @description:
 * @author: Skyler
 * @create: 2023-03-03 17:45
 **/
@RestController
@RequestMapping("thanks")
public class ThanksController {

    @Autowired
    ThanksService thanksService;

    @GetMapping("getcontent")
    @ResponseBody
    public Result getContentByName(String name){
        if (name.equals("")) return new Result(false, "传入姓名为空！", null);
        String result = "";
        result = thanksService.getLetterByPosition(thanksService.getContentByName(name));
        return new Result(true,"成功！",result);
    }
}
