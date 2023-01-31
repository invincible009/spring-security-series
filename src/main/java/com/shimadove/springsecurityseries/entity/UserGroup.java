package com.shimadove.springsecurityseries.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "usergroup")
public class UserGroup extends AbstractEntity{
    private String name;
    private String description;
    private Date dateCreated;


}
