package ahakobyan.classLessons.bank.bankSystem;

import ahakobyan.classLessons.bank.Customer.Customer;
import ahakobyan.classLessons.bank.phone.PhoneNumber;
import ahakobyan.classLessons.bank.phone.PhoneType;
import ahakobyan.classLessons.bank.account.Account;
import ahakobyan.classLessons.bank.account.AccountBalance;
import ahakobyan.classLessons.bank.account.AccountDetail;
import ahakobyan.classLessons.bank.country.Address;
import ahakobyan.classLessons.bank.country.Country;
import ahakobyan.classLessons.bank.country.CountryCode;
import ahakobyan.classLessons.bank.creditCard.CardType;
import ahakobyan.classLessons.bank.creditCard.CreditCard;

import java.time.LocalDate;

public class BankEntityApplication {
    public static void main(String[] args) {


        CreditCard creditCard = new CreditCard("1597",7789, LocalDate.now(), CardType.VISA);
        PhoneNumber phoneNumber = new PhoneNumber(CountryCode.ARM, "041403070", PhoneType.Mobile);
        Address address = new Address(Country.AM,"Axbyur Serob", new PhoneNumber[]{});
        Customer customer = new Customer("Axas", "Petrosyan", address);
        AccountDetail accountDetail = new AccountDetail("Petros", "Petrsoyan", "petrosyan@gmail.com");
        AccountBalance accountBalance = new AccountBalance(456312.3);
        Account account =new Account(new Customer("asd", "asf",address), new AccountDetail("qe","ew","!23"), new AccountBalance(789456));
        System.out.println(customer.getCustomerName() + " " + customer.getCustomerSurname() + " " + address.getStreet() + " " +address.getCountry() + " " + accountDetail.getName() + " " + accountDetail.getSurName() + " " + accountDetail.getMailAddress() );
        System.out.println(phoneNumber.getNumber() + " "+ phoneNumber.getCountryCode() + " " + phoneNumber.getType() + " " + accountBalance.getBalance() );
    }
}
