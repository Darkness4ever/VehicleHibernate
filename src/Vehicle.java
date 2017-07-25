/**
 * Created by mahapata on 7/25/2017.
 */
public class Vehicle {
    private int id;
    private String regNo;
    private String makeModel;
    private Insurance insurance;

    public Vehicle(){

    }
    public Vehicle(String regNo, String makeModel, Insurance insurance){
        this.id=id;
        this.regNo=regNo;
        this.makeModel=makeModel;
        this.insurance=insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
