public class RetirementAccount {
    private String accountHolder;
    private double balance;

    public RetirementAccount() {
        this.accountHolder = "";
        this.balance = 0.0;
    }

    public RetirementAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void printAccountInfo() {
        System.out.println("Account Holder: "+ accountHolder);
        System.out.println("Balance: $" + balance);
    }


    //getters and setters for accountHolder and balance
    public void setBalance(double v) {
        balance = v;

    }

    public void setAccountHolder(String johnSmith) {
        accountHolder = johnSmith;
    }


}