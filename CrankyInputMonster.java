import java.util.Scanner;

public class CrankyInputMonster{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);




        System.out.println("Hey What is your name?");
        String name = input.nextLine();
        System.out.println("Sorry your parents didn't love you.");

        System.out.println("Hey " + name + " what is your favorite whole number?");
        int favoriteNum = input.nextInt();
        System.out.println(favoriteNum + " ha? That's original...");

        System.out.println("And what's your GPA?");
        double gpa = input.nextDouble();
        System.out.println("Hmm," + gpa
            + ", maybe you should start paying attention in class");
      }

}
