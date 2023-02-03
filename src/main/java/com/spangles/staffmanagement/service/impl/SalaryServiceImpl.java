package com.spangles.staffmanagement.service.impl;

import com.spangles.staffmanagement.dto.SalaryDto;
import com.spangles.staffmanagement.entity.Salary;
import com.spangles.staffmanagement.repository.SalaryRepository;
import com.spangles.staffmanagement.service.SalaryService;
import com.spangles.staffmanagement.util.StaffUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    SalaryRepository salaryRepository;

    @Override
    public SalaryDto getSalary(Long salaryId) {
        Salary salary = salaryRepository.getSalary(salaryId);
        StaffUtil staffUtil = new StaffUtil();
        SalaryDto salaryDto = staffUtil.convertingEntityToDto(salary);
        return salaryDto;
    }

    @Override
    public SalaryDto saveSalary(SalaryDto salaryDto) {
        StaffUtil staffUtilReference = new StaffUtil();
        Salary salary = staffUtilReference.concertingDtoToEntity(salaryDto);
        Salary salaryEntity = salaryRepository.save(salary);
        StaffUtil staffUtil = new StaffUtil();
        SalaryDto salaryDtoResponse = staffUtil.convertingEntityToDto(salaryEntity);
        return salaryDtoResponse;
    }

    @Override
    public SalaryDto updateSalary(SalaryDto salaryDto) {
        StaffUtil staffUtilReference = new StaffUtil();
        Salary salary = staffUtilReference.concertingDtoToEntity(salaryDto);
        Salary salaryEntity = salaryRepository.save(salary);
        StaffUtil staffUtil = new StaffUtil();
        SalaryDto salaryDtoResponse = staffUtil.convertingEntityToDto(salaryEntity);
        return salaryDtoResponse;
    }

    @Override
    public void delete(SalaryDto salaryDto) {
        StaffUtil staffUtil = new StaffUtil();
        Salary salary = staffUtil.concertingDtoToEntity(salaryDto);
        salaryRepository.delete(salary);

    }
}
