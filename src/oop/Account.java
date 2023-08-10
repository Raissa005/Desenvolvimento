package oop;

public class Account {

    private String ownerName;
    private int accountNumber;
    private Double accountBalance;

    public Account(String ownerName, int numberAccount) {
        this.ownerName = ownerName;
        this.accountNumber = numberAccount;
        this.accountBalance = 0.0;
    }

    public String getOwnerName() {

        return this.ownerName;

    }

    public int getNumberAccount() {

        return this.accountNumber;
    }

    public Double getAccountBalance() {

        return this.accountBalance;
    }

    public Double withdraw(Double value) {
        if (value > accountBalance) {
            return -1.0;
        } else {
            this.accountBalance -= value;
            return this.accountBalance;
        }
    }
    
    public Double deposit(Double value){
        
        this.accountBalance += value;
        return this.accountBalance;
        
    }
}
