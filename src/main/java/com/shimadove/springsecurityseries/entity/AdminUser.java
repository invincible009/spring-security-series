package com.shimadove.springsecurityseries.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shimadove.springsecurityseries.attributes.PersonAttributes;
import com.shimadove.springsecurityseries.enums.UserType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="adminuser", uniqueConstraints = @UniqueConstraint(columnNames = {"userName", "deletedOn"}))
public class AdminUser extends User implements PersonAttributes {

    public AdminUser() {
        this.userType =(UserType.ADMIN);
    }

    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private List<UserGroup> groups;

    @JsonIgnore
    public List<UserGroup> getGroups() {
        return groups;
    }

    @JsonIgnore
    public void setGroups(List<UserGroup> groups) {
        this.groups = groups;
    }

    public String getIsFirstTimeLogon() {
        return isFirstTimeLogon;
    }

    public void setIsFirstTimeLogon(String isFirstTimeLogon) {
        this.isFirstTimeLogon = isFirstTimeLogon;
    }

    protected String isFirstTimeLogon = "Y";



    @Override
    @JsonIgnore
    public boolean isExternal() {
        return false;
    }

    @Override
    public String toString() {
        return "AdminUser{"+super.toString()+"}";
    }
}
