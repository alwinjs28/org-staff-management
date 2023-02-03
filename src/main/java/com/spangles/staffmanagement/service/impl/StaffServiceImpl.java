package com.spangles.staffmanagement.service.impl;

import com.spangles.staffmanagement.dto.StaffDto;
import com.spangles.staffmanagement.entity.Staff;
import com.spangles.staffmanagement.repository.StaffRepository;
import com.spangles.staffmanagement.service.StaffService;
import com.spangles.staffmanagement.util.StaffUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;

    public StaffDto getStaff(Long staffId){
        Staff staffEntity = staffRepository.getStaff(staffId);
        StaffUtil staffUtil = new StaffUtil();
        StaffDto staffDtoResponse = staffUtil.convertingEntityToDto(staffEntity);

        return staffDtoResponse;
    }

    @Override
    public StaffDto saveStaff(StaffDto staffDto) {
        StaffUtil staffUtilReference = new StaffUtil();
        Staff staff = staffUtilReference.convertingDtoToEntity(staffDto);
        Staff staffEntity = staffRepository.save(staff);
        StaffUtil staffUtil = new StaffUtil();
        StaffDto staffDtoResponse = staffUtil.convertingEntityToDto(staffEntity);

        return staffDtoResponse;
    }

    @Override
    public StaffDto updateStaff(StaffDto staffDto) {
        StaffUtil staffUtilReference = new StaffUtil();
        Staff staff = staffUtilReference.convertingDtoToEntity(staffDto);
        Staff staffEntity = staffRepository.save(staff);
        StaffUtil staffUtil =new StaffUtil();
        StaffDto staffDtoResponse = staffUtil.convertingEntityToDto(staffEntity);


        return staffDtoResponse;
    }

    @Override
    public void deleteStaff(StaffDto staffDto) {
        StaffUtil staffUtilReference = new StaffUtil();
        Staff staff = staffUtilReference.convertingDtoToEntity(staffDto);
        staffRepository.delete(staff);

    }

}
