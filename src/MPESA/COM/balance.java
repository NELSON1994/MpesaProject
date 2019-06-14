package MPESA.COM;

public class balance {

    int bal = 200;
    deposit deo = new deposit();

    public balance() {


    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        bal = 200;
        this.bal = bal;
    }

    public deposit getDeo() {
        return deo;
    }

    public void setDeo(deposit deo) {
        this.deo = deo;
    }


}
