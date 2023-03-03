package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PositionMapper {
    @Select("select * from position where name = #{name}")
    Position getPositionByName(String name);
}
