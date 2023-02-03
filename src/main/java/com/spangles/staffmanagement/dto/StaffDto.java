package com.spangles.staffmanagement.dto;

import java.io.Serializable;

public class StaffDto implements Serializable {
    private Long staffId;
    private String staffName;
    private Integer staffAge;
    private Integer numberOfYearsExperience;
    private String place;

    public StaffDto(){

    }
    public StaffDto(Long staffId,String staffName,Integer staffAge,Integer numberOfYearsExperience,String place){
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.numberOfYearsExperience = numberOfYearsExperience;
        this.place = place;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public Integer getNumberOfYearsExperience() {
        return numberOfYearsExperience;
    }

    public void setNumberOfYearsExperience(Integer numberOfYearsExperience) {
        this.numberOfYearsExperience = numberOfYearsExperience;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
