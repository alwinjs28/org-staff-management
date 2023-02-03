package com.spangles.staffmanagement.service;

import com.spangles.staffmanagement.dto.SalaryDto;

public interface SalaryService {
    public SalaryDto getSalary(Long salaryId);
    public SalaryDto saveSalary(SalaryDto salaryDto);
    public SalaryDto updateSalary(SalaryDto salaryDto);
    public void delete(SalaryDto salaryDto);

}
