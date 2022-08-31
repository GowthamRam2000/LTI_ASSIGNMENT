import java.util.Scanner;

public class ASSIGNMENT1 {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(calculate_price(input.nextInt()));
    }
    private static double calculate_price(int units){
        double std_price=1.20;
        double price=0;
        if(units<100){
            price=std_price*units;

        }
        if(units>=100&&units<=300){
            price=2*units;

        }
        if(units>300){
            price=3*units;

        }
return price;
    }
}
