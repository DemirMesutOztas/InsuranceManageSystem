public class AddressManager {

    public static void addAdres(Address add, User user)
    {
        user.getAddList().add(add);
    }

    public static void deleteAdres(Address add, User user)
    {
        user.getAddList().remove(add);
    }




}
