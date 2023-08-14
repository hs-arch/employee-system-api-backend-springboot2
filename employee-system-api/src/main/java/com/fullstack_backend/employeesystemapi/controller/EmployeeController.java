package com.fullstack_backend.employeesystemapi.controller;

import com.fullstack_backend.employeesystemapi.model.Employee;
import com.fullstack_backend.employeesystemapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeservice) {
        this.employeeService = employeeService;
    }


    @PostMapping("/employee_entity")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}

//    @RequestMapping("/test")
//    public void test() {
//        System.out.println("inside method");
//    }
//}
