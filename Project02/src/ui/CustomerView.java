package ui;

import bean.Customer;
import service.CustomerList;
import utility.CMUtility;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N)");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }


            }

        }


    }

    private void addNewCustomer() {

    }

    private void modifyCustomer() {

    }

    private void deleteCustomer() {

    }

    public CustomerView() {
        Customer customer = new Customer("王",'男',23,"123123123","wt@email.com");
        customerList.addCustomer(customer);
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println(i + 1 + "\t" + allCustomers[i].getName() + "\t" + allCustomers[i].getGender() + "\t"
                        + allCustomers[i].getAge() + "\t\t" + allCustomers[i].getPhone() + "\t" + allCustomers[i].getEmail());
                //System.out.println((i + 1) + "\t" + allCustomers[i].getDetails());
            }
        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

}

