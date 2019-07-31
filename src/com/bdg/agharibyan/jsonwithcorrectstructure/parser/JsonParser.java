package com.bdg.agharibyan.jsonwithcorrectstructure.parser;

public interface JsonParser<T> {

    T parse(String content);
}
