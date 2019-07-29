package com.bdg.json.parser;


/**
 * @author William Arustamyan
 */


public interface JsonParser<T> {

    T parse(String content);
}
