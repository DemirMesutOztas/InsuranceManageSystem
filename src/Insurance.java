import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class Insurance {
    String insuranceName;
     double fee;
     double rate;

    LocalDate firstDate;
     LocalDate lastDate;

    Insurance()
    {

        this.firstDate=LocalDate.now();
        this.lastDate=firstDate.plusYears(1);

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }



    public LocalDate getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(LocalDate firstDate) {
        this.firstDate = firstDate;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public abstract double calculate();

}
