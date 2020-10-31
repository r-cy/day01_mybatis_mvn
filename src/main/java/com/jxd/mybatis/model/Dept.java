package com.jxd.mybatis.model;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/15
 * @Version 1.0
 */
public class Dept {
    private int deptno;
    private String dname;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Dept() {
    }

    public Dept(int deptno, String dname) {
        this.deptno = deptno;
        this.dname = dname;
    }
}
