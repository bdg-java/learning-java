package com.bdg.agharibyan.bankaccountsystem.service.accountDetail;

import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;

public interface AccountDetailService {

    AccountDetail create(int accountNumber, CreditCard creditCard);

    AccountDetail get(int id);

    AccountDetail delete(int id);

}
