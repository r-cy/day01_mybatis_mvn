package com.jxd.mybatis.test;

import com.jxd.mybatis.model.Emp;
import com.jxd.mybatis.service.IEmpService;
import com.jxd.mybatis.service.impl.EmpServiceImpl;

import java.util.List;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/10
 * @Version 1.0
 */
public class TestMybatis {
    public static void main(String[] args) {
        IEmpService empService = new EmpServiceImpl();
        //查询所有的员工
        /*List<Emp> list1 = empService.getAll();
        System.out.println("工号\t姓名\t工作");
        for (Emp emp : list1) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/

        //新增员工
        /*Emp emp = new Emp();
        emp.setEname("大张伟");
        emp.setJob("songer");
        int num = empService.addEmp(emp);
        System.out.println(num);*/

        //编辑员工信息
        /*Emp emp = new Emp();
        emp.setEmpno(37);
        emp.setEname("张伟");
        emp.setJob("songer");
        boolean flag = empService.editEmp(emp);
        System.out.println(flag);*/

        //查询单个员工
        /*Emp emp = empService.getOne(37);
        System.out.println(emp.getEname());*/

        //根据编号和姓名进行查询
       /* Emp emp = empService.getOneByName(37,"张伟");
        System.out.println(emp.getEname());*/

        //排序查询
        /*List<Emp> list = empService.selectAllInorder("ename");
        System.out.println("工号\t姓名\t工作");
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/
        //普通模糊查询
        /*List<Emp> list = empService.selectByName("张");
        System.out.println("工号\t姓名\t工作");
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/

        //分页查询
        /*List<Emp> list2 = empService.selectByPage(0,3);
        System.out.println("工号\t姓名\t工作");
        for (Emp emp : list2) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/

        //批量删除
        /*int[] empno = {36,37};
        boolean flag = empService.deleteEmp(empno);*/

        //动态sql if单字段模糊查询
        /*List<Emp> list = empService.getAll(null);
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/

        //动态sql where多字段模糊查询
        List<Emp> list = empService.getByEnameAndJob("张","c");
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }

        //动态sql choose查询
        /*List<Emp> list = empService.getByJob("player");
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob());
        }*/
    }
}
