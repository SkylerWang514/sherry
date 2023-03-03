package com.tencent.wxcloudrun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @program: springboot-wxcloudrun
 * @description:
 * @author: Skyler
 * @create: 2023-03-03 18:01
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private boolean result;

    private String attention;

    private Object data;
}
