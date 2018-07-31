package com.geographic.dao;

import com.geographic.entity.TbUser;
import com.geographic.entity.TbUserExample;
import java.util.List;


import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    List<TbUser> queryUser();

    TbUser queryUserById(int id);

    TbUser queryUserByName(String username);

    int insertUser(TbUser tbUser);

    int updateUser(TbUser tbUser);

    int deleteUser(int id);

    TbUser findById(int id);

}