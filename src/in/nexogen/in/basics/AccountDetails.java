package in.nexogen.in.basics;

/**
 * Created by dv on 1/8/17.
 */
public class AccountDetails {
    int accountNumber;
    String name;
    float amount;
    void insert(int accountNumber , String name , float amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    void depositAmount(float amount) {
        this.amount += amount;
        System.out.println(amount + " deposited");
    }

    void withdraw(float amount) {
        if(this.amount < amount) {
            System.out.println("Insufficient Balance");
        }
        else {
            this.amount -= amount;
            System.out.println(amount + " withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is: " + this.amount);
    }

    void display() {
        System.out.println(this.accountNumber + " " + this.name + " " + this.amount);
    }
}
