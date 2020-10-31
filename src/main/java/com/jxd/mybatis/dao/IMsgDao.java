package com.jxd.mybatis.dao;

import com.jxd.mybatis.model.Msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMsgDao {
    /**
     * 批量插入
     * @param msgList
     * @return
     */
    int insertBatch(@Param("msgList") List<Msg> msgList);
    boolean updataBatch(List<Msg> msgList);
}
