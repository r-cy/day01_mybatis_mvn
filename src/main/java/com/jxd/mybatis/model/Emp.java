package com.jxd.mybatis.model;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/10
 * @Version 1.0
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;

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

    public Emp() {
    }

    public Emp(int empno, String ename, String job) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }
}
