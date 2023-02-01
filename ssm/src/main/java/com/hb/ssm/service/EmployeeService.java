package com.hb.ssm.service;

import com.hb.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
