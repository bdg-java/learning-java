package com.bdg.enums;

public class EnumUsageApplication {

    public static void main(String[] args) {

        InlineAbstractObject object = new InlineAbstractObject() {
            @Override
            public String name() {
                return "M";
            }
        };


        System.out.println(object.name());
    }

}

