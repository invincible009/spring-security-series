package com.shimadove.springsecurityseries.entity;

import com.shimadove.springsecurityseries.enums.UserType;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "role")
public class Role  extends AbstractEntity{
    private String name;
    private String email;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private UserType userType;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_permission", joinColumns =
    @JoinColumn(name = "role_id", referencedColumnName = "id"), inverseJoinColumns =
    @JoinColumn(name = "permission_id", referencedColumnName = "id") )
    private Collection<Permission> permissions;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {

        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Collection<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
