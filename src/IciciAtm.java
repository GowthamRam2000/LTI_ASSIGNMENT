import java.util.Scanner;

public class IciciAtm implements Assingnment_Interface {
    private static Scanner input=new Scanner(System.in);
    int balance=input.nextInt();

    @Override
    public void withdraw(int accountNumber, double amount) {
        if(amount>balance){
            balance-=amount;
            System.out.println(balance+"after succesful withdrawal");
        }else {
            System.out.println("insufficient balance");
        }
    }

    @Override
    public void changePassword(int accountNumber, String oldPassword, String newPassword) {
        accountNumber=input.nextInt();
        oldPassword=input.next();
        boolean change=false;
        //very basic validation to check if old password exists no db consisting of old password is connected so block
        // is there for temp validation
        if(oldPassword!=null){
            newPassword=input.next();
        }
    }

    @Override
    public void checkBalance() {
        System.out.println(balance);

    }

    public static void main(String[] args) {
        IciciAtm a=new IciciAtm();
        a.checkBalance();
        a.withdraw(input.nextInt(),input.nextInt());
        a.changePassword(input.nextInt(), input.next(), input.next());

    }
}




