package service;

import bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[total];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        } else {
            customers[total] = customer;
            total++;
            return true;
        }
    }

    public boolean replaceCustomer(int index, Customer customer) {
        if (index > total || index <= 0) {
            return false;
        } else {
            customer = customers[index];
            return true;
        }
    }

    public boolean deleteCustomer(int index) {
        if (index > total || index <= 0) {
            return false;
        } else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            total--;
            return true;
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] cust = new Customer[total];
        for (int i = 0; i < total; i++) {
            cust[i] = customers[i];
        }
        return cust;
    }

    public Customer getCustomer(int index) {
        if (index <= 0 || index > total) {
            return null;
        } else {
            return customers[index];
        }
    }

    public int getTotal() {
        return total;
    }
}
