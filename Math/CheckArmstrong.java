package Math;
//Sum of cube of digits = number itself.
//    153 = 1³ + 5³ + 3³
public class CheckArmstrong {
    public static void main(String arg[]){
        int num = 153, temp = num, sum = 0;
        while(num > 0) {
            int r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if(sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
    }

