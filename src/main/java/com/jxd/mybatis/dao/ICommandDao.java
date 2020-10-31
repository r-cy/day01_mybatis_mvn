package com.jxd.mybatis.dao;

import com.jxd.mybatis.model.Command;

public interface ICommandDao {
    Command getOneCommandWithMsg(int cid);
}
