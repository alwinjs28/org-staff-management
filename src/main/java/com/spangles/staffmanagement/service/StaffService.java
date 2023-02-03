package com.spangles.staffmanagement.service;

import com.spangles.staffmanagement.dto.StaffDto;

public interface StaffService {
    public StaffDto getStaff(Long staffId);
    public StaffDto saveStaff(StaffDto staffDto);
    public StaffDto updateStaff(StaffDto staffDto);
    public void deleteStaff(StaffDto staffDto);
}
