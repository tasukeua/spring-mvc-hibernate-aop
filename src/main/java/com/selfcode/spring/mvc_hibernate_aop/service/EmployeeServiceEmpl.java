package com.selfcode.spring.mvc_hibernate_aop.service;

import com.selfcode.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.selfcode.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceEmpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmps() {
        return employeeDAO.getAllEmps();
    }

    @Override
    @Transactional
    public void saveEmps(Employee employee) {
        employeeDAO.saveEmps(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
