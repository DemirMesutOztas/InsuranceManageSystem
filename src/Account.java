public abstract class Account
{
    private User user;

    public final void showUserInfo()
    {
        System.out.println(this.user.getName() +" "+this.user.getSurname());
        for(Insurance i:this.user.getInsuranceList())
        {
            System.out.println(i.insuranceName+"-"+i.calculate()+"-"+i.lastDate);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract void addInsurance(Insurance insurance);

}
