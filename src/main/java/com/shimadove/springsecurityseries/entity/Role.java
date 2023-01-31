package com.shimadove.springsecurityseries.entity;

import com.shimadove.springsecurityseries.enums.UserType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role  extends AbstractEntity{
    private String name;
    private String email;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private UserType userType;
}
