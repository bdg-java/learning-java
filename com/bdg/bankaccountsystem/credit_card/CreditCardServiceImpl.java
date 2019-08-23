package com.bdg.bankaccountsystem.credit_card;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CreditCardServiceImpl implements CreditCardService {
    private  boolean lunch;
    private LocalDate exp;
    private  String cardNumber;
    private   int accountNumber;
    private CardType cardType;
    private   int defaultSize = 100;
    public CreditCard [] accountList = new CreditCard[defaultSize];
    private int id = 0;


    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
        id++;
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
            cardNumber = bankCode+rand.toString();
        return cardNumber;
    }


    public int accountNumb(){
        Random r = new Random();
        accountNumber = r.nextInt(10000001);
        return accountNumber;
    }

    public void saveBankAccount(){
        if(lunch){
            CreditCard card = new CreditCard(cardNumber, accountNumber ,exp,cardType );
            accountList[id] = card;
            lunch = false;
        }
    }
}
