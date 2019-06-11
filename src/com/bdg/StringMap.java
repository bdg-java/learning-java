package com.bdg;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

    private Map<String, String> map = new HashMap<>();

    public String get(String key) {
        return this.map.get(key);
    }

    public boolean put(String key, String value) {
        if (value != null) {
            map.put(key, value);
            return true;
        }
        return false;
    }

}
