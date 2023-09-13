package abstraction;

public class BankUtils {

    public boolean transferBalance(Account fromAccount, Account toAccount, double amountToTransfer){
        if (fromAccount.getAccountBalance() < amountToTransfer){
            return false;
        }

        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-amountToTransfer);
        toAccount.setAccountBalance(toAccount.getAccountBalance()+amountToTransfer);
        return  true;
    }
}
