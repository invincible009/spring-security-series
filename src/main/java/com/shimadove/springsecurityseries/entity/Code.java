package com.shimadove.springsecurityseries.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "code",uniqueConstraints = @UniqueConstraint(columnNames = {"code", "type", "deletedOn"}))
public class Code  extends AbstractEntity{
    private String code;
    private String type;
    private String description;
    private String extraInfo;
    private String backListed;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getBackListed() {
        return backListed;
    }

    public void setBackListed(String backListed) {
        this.backListed = backListed;
    }
}
