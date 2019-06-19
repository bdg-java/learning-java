package com.bdg.BankAccountSystem;

   enum Country {
       AM("Armenia" ,"051");

       private String countryName;
       private String numercCode;

       Country(String countryName, String numercCode) {
           this.countryName = countryName;
           this.numercCode = numercCode;
       }
   }
