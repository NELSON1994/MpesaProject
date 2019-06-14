package MPESA.COM;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class withdraw {
    static int agentNumber = 673426;
    int amount;
    String idNumber;
    //static int TransactionFees=10;
    Date dt;
    //Time TimeOfTransaction;

    static int feescharges = 10;

    public withdraw() {

    }


    public int getAmount() {
        balance balx = new balance();
        deposit dp = new deposit();

        int one = dp.getAmount() - 10;
        //if(amount > one){
        //System.out.print("YOUR TRANSACTION FAILED DUE TO INSUFFICCIENT FUNDS TO DO THE TRANSACTION");
        // System.out.println("YOU CAN WITHDRAW >>>>>>> :");
        //System.out.println(one);
        // }
        // else{
        System.out.println("YOU HAVE WITHDRAWN  >>>>>>");
        System.out.println(amount);
        int x = one - amount;
        System.out.println("YOUR NEW MPESA BALANCE IS >>>>> ");
        System.out.println(x);
        //}
        return 0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDt() {

        //getting current date and time using Date class
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
}
