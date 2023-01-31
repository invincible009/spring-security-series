package com.shimadove.springsecurityseries.entity;

import com.shimadove.springsecurityseries.attributes.PersonAttributes;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact  extends AbstractEntity implements PersonAttributes {

    private String firstName;
    private String lastName;
    private String email;
    @Column(name = "outsider")
    private boolean external;


    @ManyToOne
    UserGroup userGroup;

    public Contact(){

    }

    public Contact(String firstName, String lastName, String email, boolean external) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.external = external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    @Override
    public boolean isExternal() {
        return external;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email =email;
    }
}
