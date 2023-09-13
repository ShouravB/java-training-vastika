package abstraction;

public class AbstractionExample {

    public static void main(String[] args) {
        Account accountA = new Account();
        accountA.setAccountNumber("3241567890234");
        accountA.setAccountHolderName("Shourav Bhattarai");
        accountA.setSocialSecurityNumber("1234567890");
        accountA.setAccountBalance(1000.00);

        Account accountB = new Account();
        accountB.setAccountNumber("987654345689");
        accountB.setAccountHolderName("Sameer Bhattarai");
        accountB.setSocialSecurityNumber("0123456789");
        accountB.setAccountBalance(500.00);

        BankUtils bankUtils = new BankUtils();
        if(bankUtils.transferBalance(accountA, accountB,1000.00)){
            System.out.println("balance transfer successful");
        }else{
            System.out.println("Balance couldnt be transfer");
        }

    }
}
