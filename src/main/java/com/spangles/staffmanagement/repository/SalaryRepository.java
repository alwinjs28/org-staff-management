package com.spangles.staffmanagement.repository;

import com.spangles.staffmanagement.entity.Salary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary,Long> {

    @Query(value = "SELECT s FROM Salary s WHERE s.salaryId=?1")
    public Salary getSalary(Long salaryId);
}
