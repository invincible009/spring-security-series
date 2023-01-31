package com.shimadove.springsecurityseries.entity;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface SerializableEntity<T> {
    String serialize() throws JsonProcessingException;

    void deserialize(String data) throws IOException;
}
