public class Main {
    public static void main(String[] args) {
        //Create a RetirementAccount object
        RetirementAccount account = new RetirementAccount();
        account.setAccountHolder("John Doe");
        account.setBalance(10000.74);


        //Create an array to store IRA objects
        IRA[] iraAccounts = new IRA[3];

        // Instantiate and initialize 3 IRA objects
        iraAccounts[0] = new IRA("Ahmed Khan", "Roth", 5000.49, 40);
        iraAccounts[1] = new IRA("Joe Hussain", "Traditional", 8000.98, 35);
        iraAccounts[2] = new IRA("Jerry Washington", "Roth", 12000.75, 50);

        //Create an array to store FourOhOneK objects
        FourOhOneK[] fourOhOneKAccounts = new FourOhOneK[3];

        //Instantiate and initialize 3 FourOhOneK objects
        fourOhOneKAccounts[0] = new FourOhOneK("Muhammad Ross", 15, 20000.29, 3);
        fourOhOneKAccounts[1] = new FourOhOneK("Nick Gomez", 12,  15000.19, 5);
        fourOhOneKAccounts[2] = new FourOhOneK("Danny Ford", 19, 25000.43, 2);

        // Print out the account information for each object
        System.out.println();
        System.out.println("Superclass object that was instantiated and initialized in main");
        account.printAccountInfo();

        System.out.println();

        System.out.println("---These are the IRA account owners and the details---");
        System.out.println();
        for (IRA ira : iraAccounts) {
            ira.printAccountInfo();
            System.out.println();
        }

        System.out.println("---These are the 401k account owners and the details---");
        System.out.println();
        for (FourOhOneK fourOhOneK : fourOhOneKAccounts) {
            fourOhOneK.printAccountInfo();
            System.out.println();
        }


        //Display the total number of IRA objects created
        int totalFourOhOneKAccounts = fourOhOneKAccounts.length;
        int totalIRAAccounts = iraAccounts.length;
        int totalSubclassObjects = totalIRAAccounts + totalFourOhOneKAccounts;

        System.out.println("Total number of IRA objects created: " + totalIRAAccounts);
        System.out.println("Total number of 401k objects created: " + totalFourOhOneKAccounts);
        System.out.println("Total number of subclass objects created: " + totalSubclassObjects);
    }


}


