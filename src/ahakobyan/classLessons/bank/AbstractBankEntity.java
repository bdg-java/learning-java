package ahakobyan.classLessons.bank;


public class AbstractBankEntity {

    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity() {

    }

    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
