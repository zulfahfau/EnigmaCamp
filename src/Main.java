import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static int hitungKata(String input) {
        if (input == null || input.isEmpty()) return 0;
        String[] words = input.split("\\s+");
        return words.length;
    }


    static void cutTheBamboo() {
        System.out.print("Input the Bamboos : ");
        int bamboo = input.nextInt();
        int[] bamboos = new int[bamboo];

        for (int i = 0; i < bamboo; i++) {
            System.out.print("Input the partition " + (i + 1) + " is ");
            bamboos[i] = input.nextInt();
        }

        System.out.println("Amount/s of the Bamboos is " + bamboo);

        for (int i = 0; i < bamboo; i++) {
            System.out.println("The partition " + (i + 1) + " is " + bamboos[i]);
        }

        System.out.print("The partition that will be removed is ");
        int cut = input.nextInt();
        input.nextLine();

        for (int i = 0; i < bamboo; i++) {
            bamboos[i] = bamboos[i] - cut;
            if (bamboos[i] <= 0) {
                System.out.println("The partition " + (i + 1) + " is " + 0);
            } else if (bamboos[i] >= 1) {
                System.out.println("The partition " + (i + 1) + " is " + bamboos[i]);
            }
        }
    }

    static void menu() {
        System.out.println("Hello Welcome to the Program");
        System.out.println("----------------------------");
        System.out.println("Please choose the option");
        System.out.println("1. Hitung Kata");
        System.out.println("2. Cut The Bamboo");

        System.out.print("Your input: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                input.nextLine();
                System.out.print("Input text : ");
                String text = input.nextLine();
                System.out.println(hitungKata(text));
                break;
            case 2:
                System.out.println("");
                cutTheBamboo();
                break;
            default:
                System.out.println("\n\n!!Please enter right value!!");
                menu();
                break;
        }
    }

    public static void main(String[] args) {
        boolean loop = true;
        String answer;
        while (loop) {
            menu();
            System.out.println("Want to try again? (Y/N) : ");
            answer = input.nextLine();
            loop = (answer.equals("y") || answer.equals("Y")) ? true : false;
            System.out.println("\n");
        }
    }
}
