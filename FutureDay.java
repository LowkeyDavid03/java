import java.util.Scanner;

public class FutureDay{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("What weekday is it today?");
    System.out.println("Please enter: ");
    System.out.println(" 0 for Monday");
    System.out.println(" 1 for Tuesday");
    System.out.println(" 2 for Wednesday");
    System.out.println(" 3 for Thursday");
    System.out.println(" 4 for Friday");
    System.out.println(" 5 for Saturday");
    System.out.println(" 6 for Sunday");
    //String weekday = input.next();
    //int weekdayNum = input.
    int weekdayNum = input.nextInt();

    System.out.println("Please enter a positive number "
                        + "and I'll tell you what weekday "
                        + "it will be that many days pass." );
    int numDaysIntoFuture = input.nextInt();

    final int NUM_DAYS_PER_WEEK = 7;

    int futureWeekdayNum = (numDaysIntoFuture + weekdayNum) % NUM_DAYS_PER_WEEK;

    System.out.println("In " + numDaysIntoFuture + " days it will be "
                      + "weekday number " + futureWeekdayNum);

    int numWeeks, numDays;
    numWeeks = numDaysIntoFuture / NUM_DAYS_PER_WEEK;
    numDays = numDaysIntoFuture % NUM_DAYS_PER_WEEK;

    System.out.println("In " + numWeeks + " weeks and " + numDays + " days "
                        + "it will be weekday number " + futureWeekdayNum);
    input.close();
  }
}
