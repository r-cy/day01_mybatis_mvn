package com.jxd.mybatis.service.impl;

import com.jxd.mybatis.dao.IEmployeeDao;
import com.jxd.mybatis.model.Employee;
import com.jxd.mybatis.service.IEmployeeService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmployeeServiceImpl
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/15
 * @Version 1.0
 */
public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDao employeeDao;
    @Override
    public List<Employee> selectWithDept() {
        SqlSession ss = null;
        List<Employee> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            employeeDao = ss.getMapper(IEmployeeDao.class);
            list = employeeDao.selectWithDept();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> selectWithDeptByMap() {
        SqlSession ss = null;
        List<Map<String,Object>> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            employeeDao = ss.getMapper(IEmployeeDao.class);
            list = employeeDao.selectWithDeptByMap();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
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
