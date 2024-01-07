package gr.aueb.cf.ch11;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     *  Public API - Business Services
     */

    /**
     * Deposits a certain amount of money in
     * the Account.
     *
     * @param amount
     *      the amount to be deposited.
     * @throws Exception
     *      if the amount of money is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount error");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money based on a
     * valid ssn.
     *
     * @param amount
     *      the amount of money to be withdrawn.
     * @param ssn
     *      the given ssn.
     * @throws Exception
     *      if the ssn is not valid or if the balance
     *      is not sufficient.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance error");
            }

            if (!isSsnValid(ssn)) {
                throw new Exception("Bad ssn");
            }

            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Returns account's balance.
     *
     * @return
     */
    public double getAccountBalance() {
        return getBalance();
    }
}
