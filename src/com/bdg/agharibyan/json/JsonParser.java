package com.bdg.agharibyan.json;

public interface JsonParser<T> {

    public T parse(String jsonContent);

}
