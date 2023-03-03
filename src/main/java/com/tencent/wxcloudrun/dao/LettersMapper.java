package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Letters;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LettersMapper {

    @Select("select * from letters where position = #{position}")
    Letters getLettersByPosition(String position);
}
