package com.bdg.Hashmap;
  import java.util.HashMap;
public class HashmapPut {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.remove("Norway");
        System.out.println(capitalCities);
        capitalCities.clone();
        System.out.println(capitalCities);
         capitalCities.clear();
         System.out.println(capitalCities);

    }
}
