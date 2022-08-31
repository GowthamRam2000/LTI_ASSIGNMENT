import java.util.Scanner;

public class Assignment_5 {
    private static Scanner input=new Scanner(System.in);
    private int accNo;
    private double accBal;
    private String accPass;
    private String BankName;

    public Assignment_5() {
    }

    public Assignment_5(int accNo, double accBal, String accPass, String bankName) {
        this.accNo = accNo;
        this.accBal = accBal;
        this.accPass = accPass;
        BankName = bankName;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Assignment_5.input = input;
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
private void displayAccount(){
    System.out.println(getBankName()+""+getAccPass()+""+getAccBal()+""+getAccNo());

}
public static void main(String[] args) {
Assignment_5 a=new Assignment_5();

a.displayAccount();

    }

}
