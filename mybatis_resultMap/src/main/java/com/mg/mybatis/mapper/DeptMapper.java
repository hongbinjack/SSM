package com.mg.mybatis.mapper;

import com.mg.mybatis.pojo.Dept;
import com.mg.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /**
     *通过分步查询查询员工以及所对应的部门信息的第二步
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId ") Integer deptId);


    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);


    /**
     *通过分布查询查询部门以及部门中的员工信息的第一步
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);


}
