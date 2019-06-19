package com.bdg.BankAccountSystem;

    public enum CountryCode {
        ARM("+374", Country.AM);
        private String countryCode;
        private Country country;

        CountryCode(String countryCode, Country country) {
            this.countryCode = countryCode;
            this.country = country;
        }
    }
