package MPESA.COM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        register reg = new register();
        Scanner input = new Scanner(System.in);


        System.out.println("ENTER FIRST NAME");
        reg.setLastName(input.next());
        System.out.println("ENTER LAST NAME");
        reg.setDoB(input.next());
        System.out.println("ENTER DATE OF BIRTH");
        reg.setIdNumber(input.next());
        System.out.println("ENTER ID NUMBER");
        reg.setPhoneNumber(input.next());
        System.out.println("ENTER PHONE NUMBER");


        //CHECK IF THE VALUES OF THE INPUT WERE RECEIVED

        System.out.println("YOU HAVE BEEN REGISTERED");


        //DEPOSIT CASH
        deposit dep = new deposit();
        System.out.println("ENTER PHONE NUMBER");
        dep.setPhoneNumber(input.next());

        System.out.println("ENTER YOUR ID NUMBER");
        dep.setIdNumber(input.next());

        System.out.println("ENTER AMOUNT TO DEPOSIT");

        dep.setAmount(input.nextInt());
        System.out.println(dep.getAmount());


        //balance after deposit
        balance bald = new balance();
        System.out.println("YOUR OLD MPESA BALANCE IS  :");
        System.out.println(bald.getBal());

        System.out.println("YOUR NEW BALANCE IS   :");
        System.out.println(dep.getAmount());

        //WITHDRAWWING CASH

        withdraw with = new withdraw();
        System.out.println("ENTER THE ID NUMBER:");
        with.setIdNumber(input.next());
        System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
        with.setAmount(input.nextInt());

        System.out.println(with.getAmount());
        System.out.println("THE WITHDRAWAL TRANSACTION WAS MADE ON  >>>>>>");
        System.out.println(with.getDt());


        //SENDING CASH

        send snd = new send();
        System.out.println("ENTER THE RECEIVER PHONE NUMBER:");
        snd.setPhoneNumbe(input.next());
        System.out.println("ENTER AMOUNT TO SEND TO SOMEONE :");
        snd.setAmount(input.nextInt());

        System.out.println(snd.getAmount());
        System.out.println("THE SENDING TRANSACTION WAS MADE ON  >>>>>>");
        System.out.println(snd.getDt());


        //JFrame f;
        // f=new JFrame();
        // JOptionPane.showMessageDialog( f,bald.getBal());
    }
}
