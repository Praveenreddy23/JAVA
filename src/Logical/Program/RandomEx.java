package Logical.Program;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(10)+1;//It means get random no. the range between 1 to 10.
        double b = random.nextDouble(100);
        boolean c = random.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

