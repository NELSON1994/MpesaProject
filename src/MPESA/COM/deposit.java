package MPESA.COM;

import java.util.Scanner;

public class deposit {
    String phoneNumber;
    String idNumber;
    int amount;
//Date date;


    public deposit() {

    }

    Scanner sc = new Scanner(System.in);

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
//        this.idNumber = idNumber;
    }

    public int getAmount() {
        balance bc = new balance();
        int newbal;
        if (amount > 4000) {
            System.out.println("The deposit will not be made because the float is 40000");
        } else {
            newbal = amount + bc.getBal();

            System.out.println(newbal);


        }
        return 0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
