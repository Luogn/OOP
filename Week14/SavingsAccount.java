//Tài khoản tiết kiệm
public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
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
