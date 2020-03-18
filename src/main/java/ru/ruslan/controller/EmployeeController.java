package ru.ruslan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.ruslan.model.Employee;
import ru.ruslan.service.DepartmentService;
import ru.ruslan.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(value = "/departments",  method =  RequestMethod.GET)
    public ModelAndView allDepartments() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("departments");
        return modelAndView;
    }

    @RequestMapping(value = "/departments/researchDepartment", method =  RequestMethod.GET)
    public ModelAndView researchDepartment() {
        List<Employee> employees = employeeService.fromResearch();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("researchDepartment");
        modelAndView.addObject("researchDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/marketingDepartment", method =  RequestMethod.GET)
    public ModelAndView marketingDepartment() {
        List<Employee> employees = employeeService.fromMarketing();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("marketingDepartment");
        modelAndView.addObject("marketingDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/developDepartment", method =  RequestMethod.GET)
    public ModelAndView developDepartment() {
        List<Employee> employees = employeeService.fromDevelop();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("developDepartment");
        modelAndView.addObject("developDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/testDepartment", method =  RequestMethod.GET)
    public ModelAndView testDepartment() {
        List<Employee> employees = employeeService.fromTest();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("testDepartment");
        modelAndView.addObject("testDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/bookkeepingDepartment", method =  RequestMethod.GET)
    public ModelAndView bookkeepingDepartment() {
        List<Employee> employees = employeeService.fromBookkeeping();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookkeepingDepartment");
        modelAndView.addObject("bookkeepingDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/topManagersDepartment", method =  RequestMethod.GET)
    public ModelAndView topManagersDepartment() {
        List<Employee> employees = employeeService.fromTopManagers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("topManagersDepartment");
        modelAndView.addObject("topManagersDepartment", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/departments/allEmployee", method =  RequestMethod.GET)
    public ModelAndView allEmployee() {
        List<Employee> employees = employeeService.fromAllDepartments();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("allEmployee");
        modelAndView.addObject("allEmployee", employees);
        return modelAndView;
    }


    @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
    public ModelAndView addPageEmployee () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addEmployee");
        return modelAndView;
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public ModelAndView addEmployee (@ModelAttribute("employee") Employee employee,
                                     @RequestParam("departId") int departId) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/departments/allEmployee");
        employee.setDepart(departmentService.getById(departId));
        employeeService.add(employee);
        return modelAndView;
    }

    @RequestMapping(value = "/editEmployee/{id:.*}", method = RequestMethod.GET)
    public ModelAndView editEmployee (@ModelAttribute("id") int id) {
        Employee employee = employeeService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editEmployee");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("department", employee.getDepart()); //new
        return modelAndView;
    }

    @RequestMapping(value = "/editEmployee", method = RequestMethod.POST)
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee,
                                     @RequestParam("departId")int departId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/departments/allEmployee");
        employee.setDepart(departmentService.getById(departId));
        employeeService.edit(employee);
        return modelAndView;
    }

    @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
    public ModelAndView deleteEmployee (@PathVariable("id") int id) {
        Employee employee = employeeService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/departments/allEmployee");
        employeeService.delete(employee);
        return modelAndView;
    }
}
