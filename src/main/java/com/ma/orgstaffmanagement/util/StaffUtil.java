package com.ma.orgstaffmanagement.util;

import com.ma.orgstaffmanagement.dto.StaffDto;
import com.ma.orgstaffmanagement.entity.Staff;

public class StaffUtil {
    public StaffDto convertingEntityToDto(Staff staff){
        StaffDto staffDto = new StaffDto();
        staffDto.setStaffId(staff.getStaffId());
        staffDto.setStaffName(staff.getStaffName());
        staffDto.setStaffAge(staff.getStaffAge());
        staffDto.setNumberOfYearsExperience(staff.getNumberOfYearsExperience());
        staffDto.setPlace(staff.getPlace());

        return staffDto;
    }

    public Staff convertingDtoToEntity(StaffDto staffDto){
        Staff staff = new Staff();
        staff.setStaffId(staffDto.getStaffId());
        staff.setStaffName(staffDto.getStaffName());
        staff.setStaffAge(staffDto.getStaffAge());
        staff.setNumberOfYearsExperience(staffDto.getNumberOfYearsExperience());
        staff.setPlace(staffDto.getPlace());

        return staff;
    }
}
