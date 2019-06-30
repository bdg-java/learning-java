package com.bdg.agharibyan.bankaccountsystem.service.accountBalance;

import com.bdg.agharibyan.bankaccountsystem.entity.AccountBalance;

public interface AccountBalanceService {

    AccountBalance create(double ammount);

    AccountBalance get(int id);

    AccountBalance delete(int id);
}
