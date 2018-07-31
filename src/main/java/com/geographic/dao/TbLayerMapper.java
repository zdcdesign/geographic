package com.geographic.dao;

import com.geographic.entity.TbLayer;
import com.geographic.entity.TbLayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLayerMapper {
    int countByExample(TbLayerExample example);

    int deleteByExample(TbLayerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLayer record);

    int insertSelective(TbLayer record);

    List<TbLayer> selectByExample(TbLayerExample example);

    TbLayer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLayer record, @Param("example") TbLayerExample example);

    int updateByExample(@Param("record") TbLayer record, @Param("example") TbLayerExample example);

    int updateByPrimaryKeySelective(TbLayer record);

    int updateByPrimaryKey(TbLayer record);
}