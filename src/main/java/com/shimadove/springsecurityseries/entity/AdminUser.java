package com.shimadove.springsecurityseries.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.shimadove.springsecurityseries.attributes.PersonAttributes;
import com.shimadove.springsecurityseries.enums.UserType;
import com.shimadove.springsecurityseries.utils.PrettySerializer;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

@Entity
@Table(name="adminuser", uniqueConstraints = @UniqueConstraint(columnNames = {"userName", "deletedOn"}))
public class AdminUser extends User implements PersonAttributes , PrettySerializer {

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
    @Override
    @JsonIgnore
    public JsonSerializer<User> getSerializer() {
        return new JsonSerializer<User>() {
            @Override
            public void serialize(User value, JsonGenerator gen, SerializerProvider serializers)
                    throws IOException {

                gen.writeStartObject();
                gen.writeStringField("Username", value.userName);
                gen.writeStringField("First Name", value.firstName);
                gen.writeStringField("Last Name", value.lastName);
                gen.writeStringField("Email", value.email);
                gen.writeStringField("Phone", value.phoneNumber);
                String status =null;
                if ("A".equals(value.status))
                    status = "Active";
                else if ("I".equals(value.status))
                    status = "Inactive";
                else if ("L".equals(value.status))
                    status = "Locked";
                gen.writeStringField("Status", status);
                gen.writeStringField("Role", value.role.getName());
                gen.writeEndObject();
            }
        };
    }

}
