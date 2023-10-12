public class AccountManager
{

    private User user;

    public AccountManager(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void addHome(User u1,HomeAddress home)
    {
        u1.getAddList().add(home);
    }

    public static void addBusiness(User u1,BusinessAddress bus)
    {
        u1.getAddList().add(bus);
    }


}
