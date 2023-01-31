package com.shimadove.springsecurityseries.entity;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class AbstractEntity  implements Serializable, SerializableEntity<AbstractEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Version
    protected int version;
    protected Date deletedOn;
    protected String deleteFlag ="N";

    public AbstractEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Date deletedOn) {
        this.deletedOn = deletedOn;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    @Override
    public void deserialize(String data) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AbstractEntity abstractEntity = objectMapper.readValue(data, this.getClass());
        ModelMapper mapper = new ModelMapper();
        mapper.map(abstractEntity, this);
    }
}
