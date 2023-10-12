import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarInsurance car = new CarInsurance();
        HealthInsurance health =  new HealthInsurance();
        TravelInsurance travel = new TravelInsurance();

        HomeAddress h1 = new HomeAddress("Türkiye","Ankara","12344454","Ev");
        BusinessAddress b1 =  new BusinessAddress("Türkiye","Ankara","123213","iş");

        User u1  = new User("Demir","Öztaş","demiroztas06@hotmail.com","12345","memur",38);
        User u2  = new User("Mesut","Öztaş","demiroztas06@hotmail.com","12345","memur",38);















    }
}