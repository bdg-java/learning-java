package com.BankAccount.common;

public enum PhoneType {
    MOBILE {
        public String asLowerCase() {
            return MOBILE.toString().charAt(0) + MOBILE.toString().substring(1, MOBILE.toString().length()).toLowerCase();
        }
    },
    WORK {
        public String asLowerCase() {
            return WORK.toString().charAt(0) + WORK.toString().substring(1, WORK.toString().length()).toLowerCase();
        }
    },
    HOME {
        public String asLowerCase() {
            return HOME.toString().charAt(0) + HOME.toString().substring(1, HOME.toString().length()).toLowerCase();
        }
    };

    public abstract String asLowerCase();
}
