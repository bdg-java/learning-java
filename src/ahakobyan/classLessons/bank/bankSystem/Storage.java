package ahakobyan.classLessons.bank.bankSystem;

public interface Storage {

    int storageSize();
    boolean add(AbstractBankEntity entity);
    boolean remove(int id);
    AbstractBankEntity get(int id);
}
