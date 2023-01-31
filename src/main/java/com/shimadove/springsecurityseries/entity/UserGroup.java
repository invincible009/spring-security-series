package com.shimadove.springsecurityseries.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.shimadove.springsecurityseries.utils.PrettySerializer;

import javax.persistence.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usergroup")
public class UserGroup extends AbstractEntity implements PrettySerializer {

    private String name;
    private String description;
    private Date dateCreated;


    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private List<AdminUser> users;

    @JsonProperty
    @OneToMany(cascade = CascadeType.ALL)
    private List<Contact> contacts;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Code> custSeg;


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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }



    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    public List<AdminUser> getUsers() {
        return users;
    }

    public void setUsers(List<AdminUser> users) {
        this.users = users;
    }



    public List<Code> getCustSeg() {
        return custSeg;
    }

    public void setCustSeg(List<Code> custSeg) {
        this.custSeg = custSeg;
    }

    @Override
    public JsonSerializer<UserGroup> getSerializer()
    {
        return new JsonSerializer<UserGroup>() {

            @Override
            public void serialize(UserGroup value, JsonGenerator gen, SerializerProvider arg2)
                    throws IOException {
                gen.writeStartObject();
                gen.writeStringField("Group Name", value.name);
                gen.writeStringField("Description",value.description);



                gen.writeObjectFieldStart("Internal Admin Users");
                for(AdminUser user : value.users){
                    gen.writeObjectFieldStart(user.getId().toString());
                    //gen.writeStartObject();
                    gen.writeStringField("First Name",user.firstName);
                    gen.writeStringField("Last Name",user.lastName);
                    gen.writeStringField("Email",user.email);
                    gen.writeEndObject();
                }
                gen.writeEndObject();



                gen.writeObjectFieldStart("External Users");
                for(Contact contact : value.contacts){
                    gen.writeObjectFieldStart(contact.getId().toString());
                    //gen.writeStartObject();
                    gen.writeStringField("First Name",contact.firstName);
                    gen.writeStringField("Last Name",contact.lastName);
                    gen.writeStringField("Email",contact.email);
                    gen.writeEndObject();
                }
                gen.writeEndObject();

                gen.writeObjectFieldStart("Customer Segment");
                for(Code code : value.custSeg){
                    gen.writeObjectFieldStart(code.getId().toString());
                    //gen.writeStartObject();
                    gen.writeStringField("Customer Segment",code.getCode());
                    gen.writeEndObject();
                }
                gen.writeEndObject();
                //gen.writeEndArray();
                gen.writeEndObject();
            }
        };
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", users=" + users +
                ", contacts=" + contacts +
                ", custSeg=" + custSeg +
                '}';
    }
}
