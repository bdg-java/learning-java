//package com.bdg.BankAccountCreditCard.Storage.CreditCard;
//
//import java.time.LocalDate;
//
//public class CreditCardStorage implements Storage {
//
//    private static final int DEFAULT_STORAGE_SIZE = 10;
//    private CreditCard [] container;
//    private int storageSize;
//    private final double incSize;
//
//
//    private int currentStorageIndex = 0;
//
//    public CreditCardStorage (int storageSize){
//        this.storageSize = storageSize;
//        this.container = new CreditCard[this.storageSize];
//        this.incSize = 1.2;
//    }
//
//    public CreditCardStorage (int storageSize, double incSize){
//       this.incSize = incSize;
//       this.storageSize = storageSize;
//       this.container = new CreditCard[this.storageSize];
//    }
//
//    public CreditCardStorage(){
//        this(DEFAULT_STORAGE_SIZE);
//    }
//
//    public int  storageSize(){
//      return this.storageSize;
//    }
//
//    public  boolean add(AbstractBankEntery entity) {
//        if(this.storageSize == currentStorageIndex){
//
//        }
//        entity.setId(currentStorageIndex + 1);
//        entity.setCreated(LocalDate.now());
//
//       this.container[currentStorageIndex] = (CreditCard) entity;
//
//        currentStorageIndex++;
//        return true;
//
//    }
//
//    public  boolean remove (int id){
//        return false;
//    };
//
////    AbstractBankEntery get( int id){
////
////
////        if (id - 1 > this.currentStorageIndex) {
////            throw new CreditCardNotFoundException(id);
////        }
////
////        return this.container[id -1];
////    }
//
//
//}
