package com.spangles.staffmanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "salary_id")
    private Long salaryId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "arriers_amount")
    private Double arriersAmount;
    @Column(name = "number_of_working_days")
    private Integer numberOfWorkingDays;
    @Column(name = "paid_date")
    private Date paidDate;
    @Column(name = "paid_amount")
    private Double paidAmount;
    @Column(name = "staff_id")
    private Long staffId;

    public Salary(){

    }
    public Salary(Long salaryId,Double amount,Double arriersAmount,Integer numberOfWorkingDays,Date paidDate,Double paidAmount,Long staffId){
        this.salaryId = salaryId;
        this.amount = amount;
        this.arriersAmount =arriersAmount;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.paidDate = paidDate;
        this.paidAmount = paidAmount;
        this.staffId = staffId;
    }

    public Long getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getArriersAmount() {
        return arriersAmount;
    }

    public void setArriersAmount(Double arriersAmount) {
        this.arriersAmount = arriersAmount;
    }

    public Integer getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(Integer numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }


}
