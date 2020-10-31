package com.jxd.mybatis.service;

import com.jxd.mybatis.model.Command;
import com.jxd.mybatis.model.Msg;

import java.util.List;

public interface ICommandService {
    Command getOne(int cid);

    /**
     * 新增命令
     * @param msgList 应该是属于command对象的成员
     * @return
     */
    boolean insert(List<Msg> msgList);
    boolean update(List<Msg> msgList);
}
