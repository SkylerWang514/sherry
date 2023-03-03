package com.tencent.wxcloudrun.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springboot-wxcloudrun
 * @description:
 * @author: Skyler
 * @create: 2023-03-03 17:48
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    private Integer id;

    private String name;

    private String position;
}
