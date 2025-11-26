public class OOPS {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Dillip";
        myAcc.setPassword("abcdfgh");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
