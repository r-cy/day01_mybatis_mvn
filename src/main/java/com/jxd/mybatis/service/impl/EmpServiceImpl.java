package com.jxd.mybatis.service.impl;

import com.jxd.mybatis.dao.IEmpDao;
import com.jxd.mybatis.model.Emp;
import com.jxd.mybatis.service.IEmpService;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/10
 * @Version 1.0
 */
public class EmpServiceImpl implements IEmpService {
    private IEmpDao empDao;

    @Override
    public List<Emp> selectAllInorder(String colName) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectAllInorder(colName);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public List<Emp> getAll(String ename) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectAll(ename);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;

    }

    @Override
    public List<Emp> selectByName(String ename) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectByName(ename);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public List<Emp> selectByPage(int start, int size) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectByPage(start,size);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public Emp getOne(int empno) {
        SqlSession ss = null;
        Emp emp = new Emp();
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            emp = empDao.selectById(empno);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return emp;
    }

    @Override
    public Emp getOneByName(int empno, String ename) {
        SqlSession ss = null;
        Emp emp = new Emp();
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            emp = empDao.selectByIdAndName(empno,ename);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return emp;
    }

    @Override
    public List<Emp> getByEnameAndJob(String ename, String job) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectByEnameAndJob(ename,job);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public List<Emp> getByJob(String job) {
        SqlSession ss = null;
        List<Emp> list = null;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            list = empDao.selectByJob(job);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return list;
    }

    @Override
    public int addEmp(Emp emp) {
        SqlSession ss = null;
        int num = 0;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            num = empDao.insertEmp(emp);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return num;
    }

    @Override
    public boolean editEmp(Emp emp) {
        SqlSession ss = null;

        boolean flag = false;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            flag = empDao.updateEmp(emp);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            ss.close();
        }
        return flag;
    }

    @Override
    public boolean deleteEmp(int[] empnos) {
        SqlSession ss = null;
        boolean flag = false;
        try {
            //获取会话对象
            ss = getSession();
            //根据dao接口对应的mapper文件创建代理对象
            empDao = ss.getMapper(IEmpDao.class);
            flag = empDao.deleteByEmpno(empnos);

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
