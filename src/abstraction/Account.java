package abstraction;

public class Account {

    private String accountNumber;
    private String accountHolderName;

    private String socialSecurityNumber;
    private String exposedSocialSecurityNumber;

    private double accountBalance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.exposedSocialSecurityNumber = socialSecurityNumber.substring(socialSecurityNumber.length()-4);
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getExposedSocialSecurityNumber() {
        return exposedSocialSecurityNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
