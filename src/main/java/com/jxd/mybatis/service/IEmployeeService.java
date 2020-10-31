package com.jxd.mybatis.service;

import com.jxd.mybatis.model.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<Employee> selectWithDept();
    List<Map<String,Object>> selectWithDeptByMap();
}
