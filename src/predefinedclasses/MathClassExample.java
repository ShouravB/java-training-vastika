package predefinedclasses;

import java.util.Random;

public class MathClassExample {

    public static void main(String[] args) {
       int absValue = Math.abs(-34);
       System.out.println(absValue);

       System.out.println(Math.ceil(2.1));
       System.out.println(Math.floor(2.1));
        System.out.println(Math.round(2.1));

        System.out.println("***********************Random Number Method 1*******************************");

        Random random = new Random();
        int randNumber = random.nextInt(7);
        while(randNumber == 0){
            randNumber=random.nextInt(7);
        }
        System.out.println(randNumber);

        System.out.println("***********************Random Number Method 2*******************************");
        int randNumber1 = random.nextInt(7);
        if(randNumber1 == 0){
            System.out.println(randNumber1+1);
        }else{
            System.out.println(randNumber1);
        }

        System.out.println("***********************Random Number Method 3*******************************");
        System.out.println(random.nextInt(6)+1);


        //System.out.println(randNumber);
    }
}
