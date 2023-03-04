import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(canWeWalk(29, 23));
        System.out.println(canWeWalk(30, 24));
        System.out.println(canWeWalk(24, 25));
        System.out.println(canWeWalk(20, -26));
        System.out.println(canWeWalk(18, 27));
        System.out.println(canWeWalk(generateRandomAge(), 23));
        System.out.println(canWeWalk(generateRandomAge(), -18));
    }


    public static String canWeWalk(int age, double temperature) {
        if (age >= 20 && age < 45 && temperature >= (-20) && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age < 45 && temperature >= (-10) && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random randomNumber = new Random();
        int age = randomNumber.nextInt(100);
        return age;
    }
}

