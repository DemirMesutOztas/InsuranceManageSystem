public abstract class Address {
    public String country;
    public String city;
    public String phone;
    public String name;

    public Address(String country, String city, String phone, String name) {
        this.country = country;
        this.city = city;
        this.phone = phone;
        this.name = name;
    }

    public void showAddress()
    {
        System.out.println(this.name);
    }
}
