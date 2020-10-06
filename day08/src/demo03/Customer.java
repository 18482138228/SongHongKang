package demo03;

public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Account getAccount() {
        return account;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
