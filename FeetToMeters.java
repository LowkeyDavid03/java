//A program that converts feet to meters
//David Alvarado and Roberto De Ita//

import java.util.Scanner;

public class FeetToMeters{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a value for feet: ");
    double feet = input.nextDouble();
//Below is the formula that will convert feet to meters
    double meter = (feet * 0.305);
    System.out.println(feet + "feet is " + meter + " meters.");



  }
}
