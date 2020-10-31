package com.jxd.mybatis.service;

import com.jxd.mybatis.model.Emp;

import java.util.List;

/**
 * @ClassName IEmpService
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/10
 * @Version 1.0
 */
public interface IEmpService {
    /*排序查询*/
    List<Emp> selectAllInorder(String colName);

    /*if查询*/
    List<Emp> getAll(String ename);

    /*单字段模糊查询*/
    List<Emp> selectByName(String ename);

    /*分页查询*/
    List<Emp> selectByPage(int start, int size);

    Emp getOne(int empno);

    Emp getOneByName(int empno, String ename);

    /*where查询*/
    List<Emp> getByEnameAndJob(String ename, String job);

    /*choose查询*/
    List<Emp> getByJob(String job);

    int addEmp(Emp emp);

    boolean editEmp(Emp emp);

    /*批量删除*/
    boolean deleteEmp(int[] empnos);
}
