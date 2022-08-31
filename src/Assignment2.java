import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        randomgen(input.nextInt());
    }
    private static int randomgen(int overs){
        int array_size=overs*6;
        int total_scores=0;
        int strike=0;
        int strike_rate=0;
        int upper_bound=7;
        int score[]=new int[array_size];
        Random rand=new Random();
        for(int i=0;i<score.length;i++){
            score[i]=rand.nextInt(upper_bound);
        }
      int zero=0,one=0,two=0,three=0,four=0,five=0,six=0;
        for(int i=0;i<score.length;i++){
            if(score[i]==0){
                zero++;
            }
            else if(score[i]==1){
                one++;
            }
            else if(score[i]==2){
                two++;
            }
            else if(score[i]==3){
                three++;
            }
           else if(score[i]==4){
                four++;
            }
           else if(score[i]==5){
                five++;
            }
            else if (score[i]==6){
                six++;
            }
        }
        for(int i=0;i<score.length;i++){

            if(score[i]>0){
               strike+=score[i];
            }


        }
        System.out.println(strike);
        strike_rate=(strike/array_size)*100;
        System.out.println(strike_rate);
        System.out.println("the number of 0 = "+zero+" 1 = "+one+" two = "+two+" three = "+three+" four = "+four+" five = "+five+" six = "+six);







return array_size;


    }
}
