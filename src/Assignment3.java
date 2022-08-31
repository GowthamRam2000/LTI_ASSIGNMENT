import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
    private static Scanner input=new Scanner(System.in);
    private static int score;

    public static void main(String[] args) {
Calculate_inningswise(5);
    }
    private static int Calculate_inningswise(int innings){
        int innings_size=50*6;
        int upper_bound=7;
        int strike_rate=0;
        int total_score=0;
        int average=0;
   int innings1[]=new int[innings_size];
   int innings2[]=new int[innings_size];
   int innings3[]=new int[innings_size];
   int innings4[]=new int[innings_size];
   int innings5[]=new int[innings_size];
        Random rand=new Random();
        for(int i=0;i<innings1.length;i++){
            innings1[i]=rand.nextInt(upper_bound);
        }
        for(int i=0;i<innings2.length;i++){
            innings2[i]=rand.nextInt(upper_bound);
        }
        for(int i=0;i<innings3.length;i++){
            innings3[i]=rand.nextInt(upper_bound);
        }
        for(int i=0;i<innings4.length;i++){
            innings4[i]=rand.nextInt(upper_bound);
        }
        for(int i=0;i<innings5.length;i++){
            innings5[i]=rand.nextInt(upper_bound);
        }
        int total_runs=0;
        for (int nums:innings1) {
            if(innings1[nums]>0){
                total_runs+=innings1[nums];
            }
        }
        for (int nums:innings2) {
            if(innings2[nums]>0){
                total_runs+=innings2[nums];
            }
        }
        for(int nums:innings3) {
            if(innings3[nums]>0){
                total_runs+=innings3[nums];
            }
        }
        for (int nums:innings4) {
            if(innings4[nums]>0){
                total_runs+=innings4[nums];
            }
        }
        for (int nums:innings5) {
            if(innings5[nums]>0){
                total_runs+=innings5[nums];
            }
        }
        int zero=0,one=0,two=0,three=0,four=0,five=0,six=0;
        for(int i=0;i<innings1.length;i++){
            if(innings1[i]==0){
                zero++;
            }
            else if(innings1[i]==1){
                one++;
            }
            else if(innings1[i]==2){
                two++;
            }
            else if(innings1[i]==3){
                three++;
            }
            else if(innings1[i]==4){
                four++;
            }
            else if(innings1[i]==5){
                five++;
            }
            else if (innings1[i]==6){
                six++;
            }
        }
        for(int i=0;i<innings2.length;i++){
            if(innings1[i]==0){
                zero++;
            }
            else if(innings2[i]==1){
                one++;
            }
            else if(innings2[i]==2){
                two++;
            }
            else if(innings2[i]==3){
                three++;
            }
            else if(innings2[i]==4){
                four++;
            }
            else if(innings2[i]==5){
                five++;
            }
            else if (innings2[i]==6){
                six++;
            }
        }
        for(int i=0;i<innings3.length;i++){
            if(innings1[i]==0){
                zero++;
            }
            else if(innings3[i]==1){
                one++;
            }
            else if(innings3[i]==2){
                two++;
            }
            else if(innings3[i]==3){
                three++;
            }
            else if(innings3[i]==4){
                four++;
            }
            else if(innings3[i]==5){
                five++;
            }
            else if (innings3[i]==6){
                six++;
            }
        }
        for(int i=0;i<innings4.length;i++){
            if(innings1[i]==0){
                zero++;
            }
            else if(innings4[i]==1){
                one++;
            }
            else if(innings4[i]==2){
                two++;
            }
            else if(innings4[i]==3){
                three++;
            }
            else if(innings4[i]==4){
                four++;
            }
            else if(innings4[i]==5){
                five++;
            }
            else if (innings4[i]==6){
                six++;
            }
        }
        for(int i=0;i<innings5.length;i++){
            if(innings1[i]==0){
                zero++;
            }
            else if(innings5[i]==1){
                one++;
            }
            else if(innings5[i]==2){
                two++;
            }
            else if(innings5[i]==3){
                three++;
            }
            else if(innings5[i]==4){
                four++;
            }
            else if(innings5[i]==5){
                five++;
            }
            else if (innings5[i]==6){
                six++;
            }
        }

        System.out.println("total runs "+total_runs);

        strike_rate=((total_runs/5)*100)/5;

        System.out.println("average score = "+total_runs/5);
        System.out.println("average strike rate 5 innings = "+strike_rate);
        System.out.println("the number of 0 = "+zero+" 1 = "+one+" two = "+two+" three = "+three+" four = "+four+" five = "+five+" six = "+six);
return strike_rate;
  }


}
