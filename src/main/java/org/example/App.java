package org.example;

import org.example.model.Employee;
import org.example.model.Job;
import org.example.service.EmployeeService;
import org.example.service.JobService;
import org.example.service.serviceImpl.EmployeeServiceImpl;
import org.example.service.serviceImpl.JobServiceImpl;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        JobService jobService = new JobServiceImpl();
//        jobService.createJobTable();
//        employeeService.createEmployee();
//        employeeService.addEmployee(new Employee("Januzak","Atasov",27,"janusak@gmail.com", 3));
//        jobService.addJob(new Job("Instructor","Java","Backend developer",3));
//        System.out.println(jobService.getJobById(1L));
//        System.out.println(jobService.sortByExperience("asc"));
//        employeeService.updateEmployee(3L,new Employee("Aizat"));
//        jobService.deleteDescriptionColumn();
//        System.out.println(employeeService.getAllEmployees());
//        System.out.println(employeeService.findByEmail("eldan@gmail.com"));

//        System.out.println(employeeService.getEmployeeById(1L));
//        System.out.println(employeeService.getEmployeeByPosition("Mentor"));
//        System.out.println(jobService.getJobByEmployeeId(3L));
//        employeeService.cleanTable();
        employeeService.dropTable();

    }
}
