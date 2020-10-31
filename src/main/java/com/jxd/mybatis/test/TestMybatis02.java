package com.jxd.mybatis.test;

import com.jxd.mybatis.model.Employee;
import com.jxd.mybatis.service.IEmployeeService;
import com.jxd.mybatis.service.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TestMybatis02
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/15
 * @Version 1.0
 */
public class TestMybatis02 {
    public static void main(String[] args) {
        IEmployeeService employeeService = new EmployeeServiceImpl();

        /*List<Employee> list = employeeService.selectWithDept();
        System.out.println("员工姓名\t工作\t部门信息");
        for (Employee employee : list) {
            System.out.println(employee.getEmpno() + "\t" +
                    employee.getEname() + "\t" +
                    employee.getDept().getDname());
        }*/
        List<Map<String,Object>> list = employeeService.selectWithDeptByMap();
        for (Map map: list) {
            System.out.println(map.get("ename") + "\t" +
                    map.get("job") + "\t" +
                    map.get("dname") + "\t" +
                    map.get("deptno"));
        }
    }
}
