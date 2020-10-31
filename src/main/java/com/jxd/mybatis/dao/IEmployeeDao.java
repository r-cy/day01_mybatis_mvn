package com.jxd.mybatis.dao;

import com.jxd.mybatis.model.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
    /**
     * 查询员工以及其所在部门信息
     * @return
     */
    List<Employee> selectWithDept();

    List<Map<String,Object>> selectWithDeptByMap();

}
