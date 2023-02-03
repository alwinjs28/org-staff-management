package com.spangles.staffmanagement.util;

import com.spangles.staffmanagement.dto.SalaryDto;
import com.spangles.staffmanagement.dto.StaffDto;
import com.spangles.staffmanagement.entity.Salary;
import com.spangles.staffmanagement.entity.Staff;

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
    public SalaryDto convertingEntityToDto(Salary salary){
        SalaryDto salaryDto = new SalaryDto();
        salaryDto.setSalaryId(salary.getSalaryId());
        salaryDto.setAmount(salary.getAmount());
        salaryDto.setArriersAmount(salary.getArriersAmount());
        salaryDto.setNumberOfWorkingDays(salary.getNumberOfWorkingDays());
        salaryDto.setPaidDate(salary.getPaidDate());
        salaryDto.setPaidAmount(salary.getPaidAmount());
        salaryDto.setStaffId(salary.getStaffId());

        return salaryDto;
    }
    public Salary concertingDtoToEntity(SalaryDto salaryDto){
        Salary salary = new Salary();
        salary.setSalaryId(salaryDto.getSalaryId());
        salary.setAmount(salaryDto.getAmount());
        salary.setArriersAmount(salaryDto.getArriersAmount());
        salary.setNumberOfWorkingDays(salaryDto.getNumberOfWorkingDays());
        salary.setPaidDate(salaryDto.getPaidDate());
        salary.setPaidAmount(salaryDto.getPaidAmount());
        salary.setStaffId(salaryDto.getStaffId());

        return salary;
    }
}
