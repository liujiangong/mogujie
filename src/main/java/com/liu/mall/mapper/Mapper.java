package com.liu.mall.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface Mapper {
    List<Map<String,Object>> showgoosinfo(RowBounds row);

    List<Map<String,Object>> useronline(String username);

    List<Map<String,Object>> mallshowgoosinfo(RowBounds row,@Param("keywords") String ss);

    //List<String> search(@Param("keyword")String keyword, RowBounds row);
}