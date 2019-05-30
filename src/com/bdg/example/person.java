package com.bdg.example;


import java.time.LocalDate;


public class person {

    /**
     * @author William Arustamyan
     */

        private String name;
        private LocalDate birthDate;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isBirthDay() {
            return LocalDate.now().equals(this.birthDate);
        }


}
