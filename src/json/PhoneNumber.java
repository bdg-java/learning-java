package json;

import com.bdg.bank.CountryCode;
import com.bdg.bank.PhoneType;

public class PhoneNumber {

        private CountryCode countryCode;
        private String number;
        private PhoneType phoneType;

        public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
            this.countryCode = countryCode;
            this.number = number;
            this.phoneType = phoneType;
        }
    public String toString() {
        return this.countryCode + " , " + this.number + " , " + this.phoneType;
    }
    }

