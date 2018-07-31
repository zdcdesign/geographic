package com.geographic.dao;

import com.geographic.entity.TbPower;
import com.geographic.entity.TbPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPowerMapper {
    int countByExample(TbPowerExample example);

    int deleteByExample(TbPowerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPower record);

    int insertSelective(TbPower record);

    List<TbPower> selectByExample(TbPowerExample example);

    TbPower selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPower record, @Param("example") TbPowerExample example);

    int updateByExample(@Param("record") TbPower record, @Param("example") TbPowerExample example);

    int updateByPrimaryKeySelective(TbPower record);

    int updateByPrimaryKey(TbPower record);
}