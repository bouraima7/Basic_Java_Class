public class FourOhOneK extends RetirementAccount {
    private int year;
    private int employerMatch;

    public FourOhOneK(String accountHolder, int year, double balance, int employerMatch) {
        super(accountHolder, balance);
        this.year = year;
        this.employerMatch = employerMatch;
    }

    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Years invested: " + year);
        System.out.println("Employer Match: " + employerMatch + "%");

    }
    //getters and setters for employerMatch
}