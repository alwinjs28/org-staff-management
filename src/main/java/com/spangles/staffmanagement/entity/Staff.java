package com.spangles.staffmanagement.entity;


import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long staffId;
    @Column(name = "staff_name")
    private String staffName;
    @Column(name = "staff_age")
    private Integer staffAge;
    @Column(name = "number_of_years_experience")
    private Integer numberOfYearsExperience;
    @Column(name = "place")
    private String place;

    public Staff(){

    }
    public Staff(Long staffId,String staffName,Integer staffAge,Integer numberOfYearsExperience,String place){
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
