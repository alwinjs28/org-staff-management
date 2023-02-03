package com.spangles.staffmanagement.controller;

import com.spangles.staffmanagement.dto.SalaryDto;
import com.spangles.staffmanagement.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "salary")
@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @RequestMapping(value = "g_salary/{salary_id}",method = RequestMethod.GET)
    @ResponseBody
    public SalaryDto getSalary(@PathVariable("salary_id") Long salaryId){
        return salaryService.getSalary(salaryId);
    }
    @RequestMapping(value = "s-salary",method = RequestMethod.POST)
    @ResponseBody
    public SalaryDto saveSalary(@RequestBody SalaryDto salaryDto){
        return salaryService.saveSalary(salaryDto);
    }
    @RequestMapping(value = "u_salary",method = RequestMethod.PUT)
    @ResponseBody
    public SalaryDto updateSalary(@RequestBody SalaryDto salaryDto){
        return salaryService.updateSalary(salaryDto);
    }
    @RequestMapping(value = "d_salary",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteSalary(@RequestBody SalaryDto salaryDto){
        salaryService.delete(salaryDto);
    }
}
