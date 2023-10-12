import java.time.LocalDate;

public class ResidenceInsurance extends Insurance
{
    ResidenceInsurance() {
        super();
        this.fee=3000;
        this.insuranceName="Ziraat";
    }

    @Override
    public double calculate() {
        return this.fee;
    }
}
