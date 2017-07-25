import java.util.Date;

/**
 * Created by mahapata on 7/25/2017.
 */
public class Insurance {
    private int id;
    private double amount;
    private String company;
    private java.util.Date date;
    public Insurance(){

    }
    public Insurance(double amount, String company,java.util.Date date){
        this.id=id;
        this.amount=amount;
        this.company=company;
        this.date=date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
