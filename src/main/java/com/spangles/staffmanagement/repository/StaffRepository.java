package com.spangles.staffmanagement.repository;

import com.spangles.staffmanagement.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {
    @Query(value = "SELECT s FROM Staff s WHERE s.staffId=?1")
    public Staff getStaff(Long staffId);
}
