package abstraction;

public final class BankUtils {

    private BankUtils(){}
    public static boolean transferBalance(Account fromAccount, Account toAccount, double amountToTransfer){
        if (fromAccount.getAccountBalance() < amountToTransfer){
            return false;
        }

        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-amountToTransfer);
        toAccount.setAccountBalance(toAccount.getAccountBalance()+amountToTransfer);
        return  true;
    }
}
