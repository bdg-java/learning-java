package com.bdg.bankaccountsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CreditCardServiceImpl implements CreditCardService {
    private  boolean lunch;
    private LocalDate exp;
    private  String cardNumber;
    private   int accountNumber;
    private CardType cardType;

    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
        lunch = true;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        exp = LocalDate.parse(expDate,formatter);


        CardType type = CardType.find(cardType);
            if (type == null) {
                throw new InvalidCardTypeException();
                }
            else{
                this.cardType = CardType.valueOf(cardType);
            }

        CreditCard card = new CreditCard(cardNumber, accountNumber, exp, type);
        cardNumber = cardNumber();
        accountNumber = accountNumb();
        return card;
    }



    public String cardNumber(){
            String bankCode = "4355";
            Random random = new Random();
            Integer rand = random.nextInt(1000_001-1);
            String cardNum = bankCode+rand.toString();
            cardNumber =cardNum;
        return cardNumber;
    }


    public int accountNumb(){
        Random r = new Random();
        Integer n = r.nextInt(10000001);
        accountNumber = n;
        return accountNumber;
    }

    public void saveBankAccount(){
        int id;
        if(lunch){
            Random random = new Random();
            id = 1;
            int defaultSize = 100;
            CreditCard [] accountList = new CreditCard[defaultSize];
            CreditCard card = new CreditCard(cardNumber, accountNumber ,exp,cardType );
            accountList[id] = card;
            id++;
            lunch = false;
        }
    }
}
