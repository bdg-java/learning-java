package bankaccount;

import bankaccount.services.Transaction;

import java.util.Date;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer("john","ki",30);
        AccountBalance accountBalance = new AccountBalance(3000);
        CreditCard creditCard = new CreditCard("4234235",CreditCardType.VISA,new Date());
        Account account1 = new Account("123",customer,accountBalance,creditCard);
        Account account2 = new Account("123",customer,accountBalance,creditCard);
        Transaction transaction = new Transaction();
        System.out.println(account1);
        System.out.println(account2);
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
            transaction.credit(account1,account2,200);
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                transaction.credit(account2,account1,100);
            }
        });
        thread1.start();
       // thread2.start();
        thread1.join();
     //   thread2.join();
        System.out.println("-----after----");
        System.out.println(account1);
        System.out.println(account2);
    }
}
