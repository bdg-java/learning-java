package com.bdg.agharibyan.uml_tasks.Account;

import com.bdg.agharibyan.uml_tasks.Account.Account;

public class AccountCheckApplication {
    public static void main(String[] args) {
        Account AnisfirstAccount = new Account("123456789","Ani");
        Account AnissecondAccount = new Account("987654321","Ani", 100000);
        System.out.println("firstObjectID:"+ AnisfirstAccount.getID());
        System.out.println("secondObjectID:"+ AnissecondAccount.getID());
        System.out.println("firstObjectName:"+ AnisfirstAccount.getName());
        System.out.println("secondObjectName:"+ AnissecondAccount.getName());
        System.out.println("firstObjectBalance:"+ AnisfirstAccount.getBalance());
        System.out.println("secondObjectBalance:"+ AnissecondAccount.getBalance());
        System.out.println("firstObjectBalanceAfterDebit:"+ AnisfirstAccount.debit(200000));//hatuk em naev aystegh grel, vor Credit functiony derevs ashkhatats chlini ev errory tesnem
        System.out.println("firstObjectBalanceAfterCredit:"+ AnisfirstAccount.credit(1000000));
        System.out.println("secondObjectBalanceAfterCredit:"+ AnissecondAccount.credit(1000000));
        System.out.println("firstObjectBalanceAfterDebit:"+ AnisfirstAccount.debit(200000));
        System.out.println("secondObjectBalanceAfterDebit:"+ AnissecondAccount.debit(200000));
        System.out.println("firstObjectBalanceAfterTransferToOtherAccount:"+ AnisfirstAccount.transferTo(AnissecondAccount, 850000));
        System.out.println("secondObjectBalanceAfterTransferToOtherAccount:"+ AnissecondAccount.transferTo(AnisfirstAccount, 850000));
        System.out.println("firstObject:"+ AnisfirstAccount.toString());
        System.out.println("secondObject:"+ AnissecondAccount.toString());
    }
}

//erb errorn e berum yst im grats codei, inchu naev artatpum ""-um gratss?
//orinak -- Amount exceeded balancefirstObjectBalanceAfterDebit:0
//karogh em aynpes anel, vor erb errorn e, im gratsy artatpi, erb error chka, artatpi?