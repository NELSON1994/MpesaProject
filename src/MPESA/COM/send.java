package MPESA.COM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class send {


    Date dt;
    //double balance;
    static int sendingCharges = 27;
    String phoneNumbe;
    int amount;

    public send() {

    }

    public int getDt() {
        //getting current date and time using Date class
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));


        return 0;

    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getPhoneNumbe() {
        return phoneNumbe;
    }

    public void setPhoneNumbe(String phoneNumbe) {
        this.phoneNumbe = phoneNumbe;
    }

    public int getAmount() {
        deposit dp = new deposit();
        balance bal = new balance();

        int one = dp.getAmount() - sendingCharges;
        int two = one - amount;
        if (amount > one) {
            System.out.println("YOUR MPESA TRANSFER HAS FAILED DUE TO INSUFFICIENT FUNDS FOR THE TRANSACTION");
            System.out.println("YOU ARE CAPABLE OF SENDING A MAXIMUM AMOUNT OF  >>>>>>>");
            System.out.println(one);
        } else {
            System.out.println("YOU HAVE SUCCESSFULLY TRANSFERRED :>>>");
            System.out.println(amount);
            System.out.println("YOUR NEW MPESA BALANCE IS :>>>>>>>");
            System.out.println(two);

        }
        return 0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
