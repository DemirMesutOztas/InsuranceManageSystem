import java.time.LocalDate;

public class TravelInsurance extends Insurance{


    TravelInsurance() {
        super();
        this.fee=500;
        this.insuranceName="Setur";

    }


    @Override
    public double calculate()
    {
        return this.fee*this.rate;
    }
}
