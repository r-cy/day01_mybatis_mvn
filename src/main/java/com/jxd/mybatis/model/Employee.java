package com.jxd.mybatis.model;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/15
 * @Version 1.0
 */
public class Employee {
    private int empno;
    private String ename;
    private String job;
    private int deptno;
/*    //每个员工都有一个所属的部门
    private Dept dept;*/

    //private Project project;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    /*public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }*/
}
