package com.liu.mall.mapper;

import com.liu.mall.pojo.Goodsinfo;
import com.liu.mall.pojo.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsinfoMapper {
    int countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int deleteByPrimaryKey(Integer gdid);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    Goodsinfo selectByPrimaryKey(Integer gdid);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByPrimaryKeySelective(Goodsinfo record);

    int updateByPrimaryKey(Goodsinfo record);
}