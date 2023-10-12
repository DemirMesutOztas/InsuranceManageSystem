import java.time.LocalDate;

public class HealthInsurance extends Insurance{
    HealthInsurance() {
        super();
        this.fee=1000;
        this.insuranceName="Allianz";
    }

    @Override
    public double calculate() {
        return this.fee;
    }
}
