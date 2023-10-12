import java.time.LocalDate;

public class CarInsurance extends Insurance{


    CarInsurance() {
        super();
        this.fee=2500;
        this.insuranceName="Axa";


    }



    @Override
    public double calculate()
    {
        return this.fee*this.rate;
    }
}
