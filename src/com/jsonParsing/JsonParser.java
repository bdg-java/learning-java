package com.jsonParsing;

public interface JsonParser<T> {
    T jsonParsing(String filePath);
}
