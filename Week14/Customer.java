import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    public Customer() {}

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public String getCustomerInfo() {
        return "Số CMND: " + String.valueOf(idNumber) 
        + ". Họ tên: " + fullName + ".\n";
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Remove.
     */
    public void removeAccount(Account account) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(account)) {
                accountList.remove(i);
                i--;
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setIdNumber(long id) {
        this.idNumber = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
