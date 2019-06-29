package com.bdg.agharibyan.bankaccountsystem.service.phonenumber;

import com.bdg.agharibyan.bankaccountsystem.common.exception.PhoneNumberNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.common.type.CountryCode;
import com.bdg.agharibyan.bankaccountsystem.common.type.PhoneType;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;
import com.bdg.agharibyan.bankaccountsystem.storage.PhoneNumberStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

public class PhoneNumberCrudService implements PhoneNumberService {

    private final Storage phoneNumberStorage = new PhoneNumberStorage();

    @Override
    public PhoneNumber create(CountryCode countryCode, String number, PhoneType type){
        final PhoneNumber phoneNumber = new PhoneNumber(countryCode, number, type);
        if(phoneNumberStorage.add(phoneNumber)){
            return phoneNumber;
        }
        return null;
    }

    @Override
    public PhoneNumber get(int id){
        AbstractBankEntity phoneNumber = phoneNumberStorage.get(id);
        if(phoneNumber == null){
            throw new PhoneNumberNotFoundException(id);
        }
        return (PhoneNumber) phoneNumber;
    }

    @Override
    public  PhoneNumber delete(int id){
        if(phoneNumberStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}
