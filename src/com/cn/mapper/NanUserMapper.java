package com.cn.mapper;

import com.cn.domain.NanUser;
import com.cn.domain.NanUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NanUserMapper {
    long countByExample(NanUserExample example);

    int deleteByExample(NanUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NanUser record);

    int insertSelective(NanUser record);

    List<NanUser> selectByExample(NanUserExample example);

    NanUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NanUser record, @Param("example") NanUserExample example);

    int updateByExample(@Param("record") NanUser record, @Param("example") NanUserExample example);

    int updateByPrimaryKeySelective(NanUser record);

    int updateByPrimaryKey(NanUser record);
}