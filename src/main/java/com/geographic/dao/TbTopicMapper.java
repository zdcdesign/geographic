package com.geographic.dao;

import com.geographic.entity.TbTopic;
import com.geographic.entity.TbTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTopicMapper {
    int countByExample(TbTopicExample example);

    int deleteByExample(TbTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTopic record);

    int insertSelective(TbTopic record);

    List<TbTopic> selectByExample(TbTopicExample example);

    TbTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTopic record, @Param("example") TbTopicExample example);

    int updateByExample(@Param("record") TbTopic record, @Param("example") TbTopicExample example);

    int updateByPrimaryKeySelective(TbTopic record);

    int updateByPrimaryKey(TbTopic record);
}