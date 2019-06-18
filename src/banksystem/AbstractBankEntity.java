package banksystem;
import java.util.Date;

public abstract class AbstractBankEntity {
    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity(int id) {
        this.id = id;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    public int getId() {
        return this.id;
    }
    public void setCreatedDate() {
        this.createdDate = createdDate;
    }
    public void setUpdatedDate() {
        this.updatedDate = updatedDate;
    }
    public void setId() {
        this.id = id;
    }
}
