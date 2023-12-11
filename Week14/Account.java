import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {}

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Do withdraw.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } 
        if (this instanceof SavingsAccount) {
            if (balance - amount < 5000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (amount > 1000) {
                throw new InsufficientFundsException(amount);
            }
        }
        Transaction transaction = new Transaction(amount, balance, balance - amount);
        transactionList.add(transaction);
        if (this instanceof CheckingAccount) {
            transaction.setType(Transaction.TYPE_WITHDRAW_CHECKING);
        } else {
            transaction.setType(Transaction.TYPE_WITHDRAW_SAVINGS);
        }
        balance -= amount;
    }

    /**
     * Do deposit.
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            Transaction newTr = new Transaction(amount, balance, balance + amount);
            transactionList.add(newTr);
            if (this instanceof CheckingAccount) {
                newTr.setType(Transaction.TYPE_DEPOSIT_CHECKING);
            } else {
                newTr.setType(Transaction.TYPE_DEPOSIT_SAVINGS);
            }
            balance += amount;
        }
    }

    /**
     * Get history.
     */
    public String getTransactionHistory() {
        String res = "Lịch sử giao dịch của tài khoản " 
        + String.valueOf(accountNumber) + ":\n";

        for (int i = 0; i < transactionList.size(); i++) {
            res =  res + transactionList.get(i).getTransactionSummary() + "\n";
        }

        return res;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account newAcc = (Account) obj;
            if (newAcc.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);
}
