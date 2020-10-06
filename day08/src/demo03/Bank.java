package demo03;

public class Bank {
    private Customer[] customers;//存放客户的数组
    private int numberOfCustomers;//记录客户个数


    public Bank() {
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String firstname, String lastname) {
        Customer customer = new Customer(firstname,lastname);
        customers[numberOfCustomers] = customer;
        numberOfCustomers ++;
    }

    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        else {
            System.out.println("获取失败");
            return null;
        }

    }
}
