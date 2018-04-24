package com.zk.kfcloud.Dao;

import com.zk.kfcloud.Entity.web.WeChat;

import java.util.List;

public interface WeChatMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(WeChat record);

    int insertSelective(WeChat record);

    WeChat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeChat record);

    int updateByPrimaryKey(WeChat record);

    List<WeChat> findAllWeChatUser();
}