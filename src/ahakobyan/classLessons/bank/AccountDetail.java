package ahakobyan.classLessons.bank;

public class AccountDetail {

    private String name;
    private String surName;
    private String mailAddress;

    public AccountDetail(String name, String surName, String mailAddress) {
        this.mailAddress = mailAddress;
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
