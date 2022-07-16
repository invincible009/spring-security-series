package com.shimadove.springsecurityseries.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long salesId;

    private String salesDepartment;
    private String salesAgency;
    private String salesType;

    public Sales() {
    }

    public Sales(Long salesId, String salesDepartment, String salesAgency, String salesType) {
        this.salesId = salesId;
        this.salesDepartment = salesDepartment;
        this.salesAgency = salesAgency;
        this.salesType = salesType;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesDepartment() {
        return salesDepartment;
    }

    public void setSalesDepartment(String salesDepartment) {
        this.salesDepartment = salesDepartment;
    }

    public String getSalesAgency() {
        return salesAgency;
    }

    public void setSalesAgency(String salesAgency) {
        this.salesAgency = salesAgency;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", salesDepartment='" + salesDepartment + '\'' +
                ", salesAgency='" + salesAgency + '\'' +
                ", salesType='" + salesType + '\'' +
                '}';
    }
}
