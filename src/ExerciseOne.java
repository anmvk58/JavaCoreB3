import java.util.Random;

public class ExerciseOne {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100000);
        System.out.println("Số ngẫu nhiên = " + x);

        int z = 7;

        String y = String.valueOf(x);
        int lengthOfString = y.length(); //2

        for (int i = 0; i < 5 - lengthOfString; i++) {
            y = "0" + y;
        }

        System.out.println("Result: " + y);
    }
}
