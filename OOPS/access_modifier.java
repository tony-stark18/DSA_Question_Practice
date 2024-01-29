public class access_modifier {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.username="Dipti";
        acc1.setPassword("abc@123");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
