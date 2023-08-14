package com.fullstack_backend.employeesystemapi.services;

import com.fullstack_backend.employeesystemapi.entity.EmployeeEntity;
import com.fullstack_backend.employeesystemapi.model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.fullstack_backend.employeesystemapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
