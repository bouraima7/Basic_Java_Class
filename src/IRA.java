public class IRA extends RetirementAccount{
    private int age;
    private String type;
    private static int numIRAs = 0;

    public IRA(String accountHolder, String type, double balance, int age) {
        super(accountHolder, balance);
        this.type = type;
        this.age = age;
        numIRAs++;

    }

    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
    }

    //getters and setters for age

    //printAccountInfo() method

    public static int getNumIRAs() {
        return numIRAs;
    }
}
