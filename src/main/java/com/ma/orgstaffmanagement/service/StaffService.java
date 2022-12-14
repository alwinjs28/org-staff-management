package com.ma.orgstaffmanagement.service;

import com.ma.orgstaffmanagement.dto.StaffDto;

public interface StaffService {
    public StaffDto getStaff(Long staffId);
    public StaffDto saveStaff(StaffDto staffDto);
    public StaffDto updateStaff(StaffDto staffDto);
    public void deleteStaff(StaffDto staffDto);
}
