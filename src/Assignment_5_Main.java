import java.util.Scanner;

public class Assignment_5_Main {
    private static Scanner input=new Scanner(System.in);
    private int accNo;
    private double accBal;
    private String accPass;
    private String BankName;

    public Assignment_5_Main() {
    }

    public Assignment_5_Main(int accNo, double accBal, String accPass, String bankName) {
        this.accNo = accNo;
        this.accBal = accBal;
        this.accPass = accPass;
        BankName = bankName;
    }

    public static Scanner getInput() {
        return input;
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
public void displayAccount(){
    System.out.println(getBankName()+""+getAccPass()+""+getAccBal()+""+getAccNo());

}
public static void main(String[] args) {
Assignment_5_Main a=new Assignment_5_Main();
a.displayAccount();
Assignment5_savings b=new Assignment5_savings();
b.displayAccount();
Assignment_5_currAcc c=new Assignment_5_currAcc();
c.displayAccount();

    }

}
