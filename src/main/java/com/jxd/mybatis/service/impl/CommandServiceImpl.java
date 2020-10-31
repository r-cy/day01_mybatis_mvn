package com.jxd.mybatis.service.impl;

import com.jxd.mybatis.dao.ICommandDao;
import com.jxd.mybatis.dao.IMsgDao;
import com.jxd.mybatis.model.Command;
import com.jxd.mybatis.model.Msg;
import com.jxd.mybatis.service.ICommandService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName CommandServiceImpl
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/16
 * @Version 1.0
 */
public class CommandServiceImpl implements ICommandService {
    private ICommandDao commandDao;
    private IMsgDao msgDao;
    @Override
    public Command getOne(int cid) {
        SqlSession ss = null;
        Command command = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            commandDao = ss.getMapper(ICommandDao.class);
            command = commandDao.getOneCommandWithMsg(cid);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return command;
    }

    @Override
    public boolean insert(List<Msg> msgList) {
        SqlSession ss = null;
        boolean flag = false;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            msgDao = ss.getMapper(IMsgDao.class);
            flag = msgDao.insertBatch(msgList) > 0 ? true : false;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return flag;
    }

    @Override
    public boolean update(List<Msg> msgList) {
        SqlSession ss = null;
        boolean flag = false;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            msgDao = ss.getMapper(IMsgDao.class);
            flag = msgDao.updataBatch(msgList);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return flag;
    }

    public SqlSession getSession(){
        SqlSession ss = null;
        try {
            //01-读取并加载主配置文件，获取所有的连接信息
            InputStream config = Resources.getResourceAsStream("config.xml");
            //02-根据连接信息创建会话工厂
            //会话工厂类似于连接池的概念
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(config);
            //03-根据会话工厂开启一个连接会话
            //传参true代表开启自动提交功能
            ss = sf.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ss;
    }
}
