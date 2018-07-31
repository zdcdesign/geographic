package com.geographic.dao;

import com.geographic.entity.RolePowerExample;
import com.geographic.entity.RolePowerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePowerMapper {
    int countByExample(RolePowerExample example);

    int deleteByExample(RolePowerExample example);

    int deleteByPrimaryKey(RolePowerKey key);

    int insert(RolePowerKey record);

    int insertSelective(RolePowerKey record);

    List<RolePowerKey> selectByExample(RolePowerExample example);

    int updateByExampleSelective(@Param("record") RolePowerKey record, @Param("example") RolePowerExample example);

    int updateByExample(@Param("record") RolePowerKey record, @Param("example") RolePowerExample example);
}