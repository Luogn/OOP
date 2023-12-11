//Tài khoản vãng lai
public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     */
    public void withdraw(double amount) {
        try {
            super.doWithdrawing(amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Deposit.
     */
    public void deposit(double amount) {
        try {
            super.doDepositing(amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
