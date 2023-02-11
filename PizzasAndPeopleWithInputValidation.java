//Author:David Alvarado and Mario
//User input cannot input any negative numbers or else they will recieve
//error messege
//CS 2011-01(94236)

import java.util.Scanner;

public class PizzasAndPeopleWithInputValidation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many pizzas? ");
    int numOfPizzas = input.nextInt();

    if(numOfPizzas < 0){
      System.out.println("There's no such thing as negative slices!!!");
      System.exit(0);
    }
    System.out.println("How many slices per pizza? ");
    int numSlicesPerPizza = input.nextInt();

    if(numSlicesPerPizza < 0 ){
    System.out.println("There's no such thing as negative PIZZAS!!!");
    System.exit(1);
  }

    System.out.println("How many people? ");
    int numOfPeople = input.nextInt();

    if(numOfPeople < 0){
    System.out.println("There's no such thing as negative people!!!");
    System.exit(2);
  }
    int totalSlices = numOfPizzas * numSlicesPerPizza;

    int leftOverSlices = totalSlices % numOfPeople;





    System.out.println("If you split all the pizza evenly among " + numOfPeople
                    + " people, you will have " + leftOverSlices
                    + " slices left over.");

    System.out.println("Mmmm! Cold pizza....");

    input.close();

  }
}
