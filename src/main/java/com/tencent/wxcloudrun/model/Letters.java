package com.tencent.wxcloudrun.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springboot-wxcloudrun
 * @description:
 * @author: Skyler
 * @create: 2023-03-03 17:47
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Letters {
    private Integer id;

    private String position;

    private String content;
}
