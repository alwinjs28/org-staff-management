package com.spangles.staffmanagement.dto;

import java.io.Serializable;
import java.util.Date;


public class SalaryDto implements Serializable {

    private Long salaryId;
    private Double amount;
    private Double arriersAmount;
    private Integer numberOfWorkingDays;
    private Date paidDate;
    private Double paidAmount;
    private Long staffId;

    public SalaryDto(){

    }
    public SalaryDto(Long salaryId,Double amount,Double arriersAmount,Integer numberOfWorkingDays,Date paidDate,Double paidAmount,Long staffId){
        this.salaryId = salaryId;
        this.amount = amount;
        this.arriersAmount = arriersAmount;
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
