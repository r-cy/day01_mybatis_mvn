package com.jxd.mybatis.dao;

import com.jxd.mybatis.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName IEmpDao
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/10
 * @Version 1.0
 */
public interface IEmpDao {
    List<Emp> selectAll(@Param("ename") String ename);

    /*模糊查询 同上*/
    List<Emp> selectByName(String ename);
    /**
     *
     * @param colName 排序字段
     * @return
     */
    List<Emp> selectAllInorder(@Param("colName") String colName);

    List<Emp> selectByPage(@Param("pageStart") int start,@Param("pageSize") int size);

    Emp selectById(int empno);

    Emp selectByIdAndName(@Param("empno") int empno,@Param("ename") String ename);

    List<Emp> selectByEnameAndJob(@Param("ename") String ename,@Param("job") String job);

    List<Emp> selectByJob(@Param("job")String job);

    int insertEmp(Emp emp);

    boolean updateEmp(Emp emp);

    boolean deleteByEmpno(int[] empno);

}
