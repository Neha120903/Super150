package RandomNumber;

import java.util.Random;

public class RandomNGenerate {
    public static void main(String[] args) {
        int lo=10;
        int high=100;
        Random r = new Random();
        for (int i = 0; i <40 ; i++) {
            int rn =r.nextInt(high - lo +1)+lo;//to make it inside the range whenever low and high are equal
            System.out.println(rn);
        }
    }


}
