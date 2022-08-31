import java.util.Scanner;

abstract class Assignement5_Abstract {

    double amount;
    private int accNo;
    private double accBal;
    private String accPass;
    private String BankName;
  public abstract void withdraw(int amount);

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public String getAccPass() {
        return accPass;
    }

    public void setAccPass(String accPass) {
        this.accPass = accPass;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }
}
class Main{
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Assignment5_abs_currAcc a=new Assignment5_abs_currAcc();
        a.withdraw(input.nextInt());
        Assignment5_abs_savings b=new Assignment5_abs_savings();
        b.withdraw(input.nextInt());
    }
}

