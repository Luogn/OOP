import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * Read file.
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str = "";

        try {
            while ((str = reader.readLine()) != null) {
                if (!str.contains("CHECKING") && !str.contains("SAVINGS")) {
                    long idNumber = Long.parseLong(str.substring(str.length() - 9, str.length()));
                    String name = str.substring(0, str.length() - 10);
                    Customer customer = new Customer(idNumber, name);
                    customerList.add(customer);
                } else {
                    String[] info = str.split(" ");

                    if (info[1].equals("CHECKING")) {
                        CheckingAccount checkAcc = new CheckingAccount(Long.parseLong(info[0]),
                                Double.parseDouble(info[2]));
                        customerList.get(customerList.size() - 1).addAccount(checkAcc);
                    } else if (info[1].equals("SAVINGS")) {
                        SavingsAccount saveAcc = new SavingsAccount(Long.parseLong(info[0]),
                                Double.parseDouble(info[2]));
                        customerList.get(customerList.size() - 1).addAccount(saveAcc);
                    }
                }
            }
            reader.close();
        } catch (IOException  | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sorted by Id.
     */
    public List<Customer> sortCustomerbyId() {
        List<Customer> sortedList = new ArrayList<>();
        // long tmpId = customerList.get(0).getIdNumber();
        while (!(customerList.isEmpty())) {
            Customer tmp = customerList.get(0);
            for (int i = 0; i < customerList.size(); i++) {
                if (tmp.getIdNumber() > customerList.get(i).getIdNumber()) {
                    tmp = customerList.get(i);
                }
            }
            customerList.remove(tmp);
            sortedList.add(tmp);
        }
        return sortedList;
    }

    /**
     * Sorted by Id.
     */
    public List<Customer> sortCustomerbyName() {
        List<Customer> sortedList = new ArrayList<>();
        // long tmpId = customerList.get(0).getIdNumber();
        while (!(customerList.isEmpty())) {
            Customer tmp = customerList.get(0);
            for (int i = 0; i < customerList.size(); i++) {
                if (tmp.getFullName().compareTo(customerList.get(i).getFullName()) > 0) {
                    tmp = customerList.get(i);
                }
            }
            customerList.remove(tmp);
            sortedList.add(tmp);
        }
        return sortedList;
    }

    /**
     * Print sorted by Id.
     */
    public String getCustomersInfoByNameOrder() {
        String res = "";
        customerList = sortCustomerbyName();
        for (Customer cus : customerList) {
            res += cus.getCustomerInfo();
        }
        return res;
    }

    /**
     * Print sorted by Id.
     */
    public String getCustomersInfoByIdOrder() {
        String res = "";
        customerList = sortCustomerbyId();
        for (Customer cus : customerList) {
            res += cus.getCustomerInfo();
        }
        return res;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
