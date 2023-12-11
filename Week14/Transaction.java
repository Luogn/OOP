public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_DEPOSIT_SAVINGS = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Constructor.
     */
    public Transaction(double amount, double initialBalance, double finalBalance) {
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Constructor.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String getTransactionTypeString(int type) {
        String res = "";
        if (type == TYPE_DEPOSIT_CHECKING) {
            res = "Nạp tiền vãng lai. ";
        }

        if (type == TYPE_DEPOSIT_SAVINGS) {
            res = "Nạp tiền tiết kiệm. ";
        }
         
        if (type == TYPE_WITHDRAW_CHECKING) {
            res = "Rút tiền vãng lai. ";
        }

        if (type == TYPE_WITHDRAW_SAVINGS) {
            res = "Rút tiền tiết kiệm. ";
        }

        return res;
    }

    /**
     * Summary.
     */
    public String getTransactionSummary() {
        String res = "- Kiểu giao dịch: ";
        res = res + getTransactionTypeString(type) 
        + "Số dư ban đầu: $" + String.format("%.2f", initialBalance) + ". "
        + "Số tiền: $" +  String.format("%.2f", amount) + ". "
        + "Số dư cuối: $" +  String.format("%.2f", finalBalance) + ".";
        return res;
    }
}
