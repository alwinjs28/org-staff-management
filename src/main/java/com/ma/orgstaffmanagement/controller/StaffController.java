package com.ma.orgstaffmanagement.controller;

import com.ma.orgstaffmanagement.dto.StaffDto;
import com.ma.orgstaffmanagement.entity.Staff;
import com.ma.orgstaffmanagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "staff")
@RestController
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/g_staff",method = RequestMethod.GET)
    @ResponseBody
    public StaffDto getStaff(@RequestParam("staff_id")Long staffId){
        return staffService.getStaff(staffId);
    }
    @RequestMapping(value = "/save_staff",method = RequestMethod.POST)
    @ResponseBody
    public StaffDto saveStaff(@RequestBody StaffDto staffDto){
        return staffService.saveStaff(staffDto);
    }
    @RequestMapping(value = "/update_staff",method = RequestMethod.PUT)
    @ResponseBody
    public StaffDto updateStaff(@RequestBody StaffDto staffDto){
        return staffService.updateStaff(staffDto);
    }
    @RequestMapping(value = "/d_staff",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteStaff(@RequestBody StaffDto staffDto){
        staffService.deleteStaff(staffDto);
    }
}
