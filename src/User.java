import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public  class User
{
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> addList;
    private ArrayList<Insurance> insuranceList;
    private LocalDate lastLogin;

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addList = new ArrayList<>();
        this.insuranceList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Address> getAddList()
    {
        return this.addList;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddList(ArrayList<Address> addList) {
        this.addList = addList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public void setInsuranceList(Insurance ins) {
        this.insuranceList.add(ins);
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }
}
