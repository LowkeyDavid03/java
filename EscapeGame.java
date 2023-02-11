import java.util.Scanner;
import java.util.Random;

public class EscapeGame {
  public static void main(String[] args){
  
    printSlow("Enter your prison name.");
    Scanner input = new Scanner(System.in);
    String criminalName = input.nextLine();
    System.out.println("");

    printSlow("YOUR GOING TO HAVE A TOUGH TIME "+ criminalName+ " GOODLUCK");
    System.out.println("");

    // Scanner input = new Scanner(System.in);
    printSlow("Type: Yes to continue...");

    if(input.nextLine().equalsIgnoreCase("Yes")){
      printSlow("Narrative:"+ criminalName+" was with a group of men robbing"+
      "a bank. He was the only one who got caught...");
      System.out.println("");
      printSlow("Now "+ criminalName+ " will be serving life in prison... Or" +
      " will he???");
      System.out.println("");
      printSlow("ANYWAY GOODLUCK your going to need it!");
      System.out.println("");
      printSlow(criminalName+ " begins his escape and comes across a prison"
      +"gaurd...");
      System.out.println("");
      printSlow("Prison Gaurd: STOP RIGHT "+ criminalName+ "THERE!!!");
      System.out.println("");
      printSlow("To start your fight type 1");
      System.out.println("");
      do{
        if(input.nextLine().equals("1")){
          printSlow("Welcome"+ criminalName+" to prisoner brawl");
          prisonBrawl();
          printSlow("Press 2 to continue");
          System.out.println("");
        }
        if(input.nextLine().equals("2")){
          LockPick();
          printSlow("NO WAY"+ criminalName+"YOU WERE ABLE TO LOCK PICK ");
          System.out.println("");
          printSlow("YOU HAVE 3 MORE TASK FOR YOU TO ESCAPE");
          System.out.println("");
          printSlow("Type 3 for your next task or " +
          "No to end your run");
          System.out.println("");
        }
        if(input.nextLine().equals("3")){
          printSlow("What are you doing here? Don't you know that cellmates"
          + " aren't allowed here? Hey!... Identify yourself.");
          printSlow("you aren't planning on escaping right?");
          System.out.println("");
          printSlow("Doesn't matter...");
          System.out.println("");
          printSlow("I have been working at this Facility"
          + " for 30+ years. The same things happen everyday.");
          printSlow("There is no change...");
          System.out.println("");
          printSlow("I can't remember a time being happy coming into work.");
          System.out.println("");
          printSlow("Im practically a prisoner Myself...");
          System.out.println("");
          printSlow("I've got an idea...");
          System.out.println("");
          printSlow("YES! FANTSASTIC!");
          System.out.println("");
          printSlow("I don't wanna fight, I'm too old, I also don't wanna"
          + " shoot and kill you.");
          System.out.println("");
          printSlow("Let's play a coin flip match...");
          System.out.println("");
          printSlow("Best of 5 matches");
          System.out.println("");
          printSlow("If you win...");
          System.out.println("");
          printSlow("you are free to go...,");
          System.out.println("");
          printSlow("If not...");
          System.out.println("");
          printSlow("We'll just see what you decide to do once I arrest you.");
          System.out.println("");
          randomMiniGame();
          printSlow("You have 3 more task to escape." +
          "Type 4 to go to your next task");
          System.out.println("");
        }
        if(input.nextLine().equals("4")){
          printSlow("While trying to escape you went down the sewage drain.");
          System.out.println("");
          printSlow("It is pitch black and hear alligators.");
          System.out.println("");
          printSlow("If they get you, you will have to start" +
          "from the beginning");
          System.out.println("");
          maze();
          printSlow("You have 1 last task to escape. Press 5 to continue");
          System.out.println("");
        }
        if(input.nextLine().equals("5")){
          TypeRaceEscape();

          System.out.println("");

        }
        else{
          printSlow("Thanks for playing BUT YOU SUCK!");
          System.out.println("");
          System.exit(1);
        }
      }while(input.nextLine().equalsIgnoreCase("No"));

      if(input.nextLine().equalsIgnoreCase("No")){
        printSlow("HAHAHA YOU COULDNT HANDLE IT!");
        System.out.println("");
      }
    }
    if(input.nextLine().equalsIgnoreCase("No")){
      printSlow("I KNEW YOU WERE CHICKEN!!!");
      System.out.println("");
    }
  }

  public static boolean LockPick(){
    printSlow("You have found a locked door and need"+
    " to pick the lock to continue your escape.");
    System.out.println("");
    printSlow("Use the 'turn' command to turn the "+
    "lockpick and try to open the lock.");
    System.out.println("");

    // Set the initial state of the lock
    boolean isUnlocked = false;
    int numTurns = 0;

    // Keep trying to pick the lock until it is unlocked or 10 turns have passed
    while (!isUnlocked && numTurns < 10) {
      printSlow("Enter the 'turn' command to try to pick the lock:");
      System.out.println("");

      // Get the player's input
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      if (input.equals("turn")) {
        // Determine if the lock is picked
        Random random = new Random();
        int chance = random.nextInt(100);

        if (chance < 25) {
          // Successfully picked the lock
          isUnlocked = true;
          printSlow("You have successfully picked the lock"+
          " and can continue your escape!");
          System.out.println("");
        } else {
          // Failed to pick the lock
          numTurns++;
          printSlow("The lock does not open. Try again.");
          System.out.println("");
        }
      } else {
        printSlow("Invalid input. Try again.");
        System.out.println("");
      }
    }

    if (!isUnlocked) {
      printSlow("You were unable to pick the"+
      " lock after 10 tries. Game over.");
      System.out.println("");
      System.exit(0);

    }
    return false;
  }

  public static boolean TypeRaceEscape(){
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // Set the initial position of the prisoner to 0
    int position = 0;

    // Set the initial position of the guards to 10
    int guardPosition = 10;

    // Set the escape point to 20
    int escapePoint = 20;

    // Set the initial game state to "running"
    String gameState = "running";

    // Print the game instructions
    printSlow("Escape the WARDEN by typing as fast as you can!");
    System.out.println("");

    // Start the game loop
    while (gameState.equals("running")) {
      // Print the current position of the prisoner and the guards
      printSlow("Prisoner position: " + position);
      System.out.println("");
      printSlow("Warden position: " + guardPosition);
      System.out.println("");

      // Prompt the user to type a word
      printSlow("Enter a word: ");
      System.out.println("");
      String word = input.nextLine();

      // Move the prisoner forward by the length of the word they typed
      position += word.length();

      // Move the guards forward by a random amount
      guardPosition += (int) (Math.random() * 5) + 1;

      // Check if the prisoner has reached the escape point or been caught
      if (position >= escapePoint) {
        gameState = "won";
      } else if (guardPosition >= position) {
        gameState = "lost";
      }
    }

    // Print the game over message
    if (gameState.equals("won")) {
      printSlow("You have escaped the Warden! Congratulations!");
      System.out.println("");
      System.exit(0);
    } else if (gameState.equals("lost")) {
      printSlow("You have been caught by the Warden."+
      " Better luck next time!");
      System.out.println("");
      System.exit(0);
    }
    return false;
  }



  public static void type(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
      pause((int) (Math.random() * 250));
    }
    System.out.print(" ");
  }

  public static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
    }
  }

  public static void printSlow(String text) {
    // Loop through each character in the text
    for (int i = 0; i < text.length(); i++) {
      System.out.print(text.charAt(i));
      try {
        // Pause the program for the specified delay
        Thread.sleep(5);
      } catch (InterruptedException e) {
        // Handle interrupted exception
      }
    }
  }
  public static void randomMiniGame(){
    printSlow("Choose Heads or Tails?");
    System.out.println("");
    int coinFlips = 0;
    int wins = 0;
    while(coinFlips < 5){
      Scanner input = new Scanner(System.in);
      String choice = input.nextLine();

      Random rand = new Random();
      String randComparison = "";
      int flip = rand.nextInt(2);
      if (flip == 0) {
        randComparison = "Heads";
      } else {
        randComparison = "Tails";
      }
      System.out.println(randComparison);
      if (randComparison.equalsIgnoreCase(choice)){
        printSlow("HEHEHEHA I got a win!!!");
        System.out.println("");
        ++wins;
        randComparison = "";
      } else {
        printSlow("ARRRGHHHH! I lost >:(");
        System.out.println("");
        randComparison = "";
      }
      coinFlips++;
    }
    System.out.println(wins);
    if(wins >= 3){
      printSlow("Conragulations you beat me fair and square!");
      System.out.println("");
      printSlow("You can move on to the next stage");
      System.out.println("");
    }else {
      printSlow("Get Shot BOZO, Lmaoooooo get wrecked prisoner!");
      System.out.println("");
      printSlow("YOU LOST! GAME OVER!");
      System.out.println("");
      System.exit(0);
    }
  }


  public static void maze(){
    Scanner input = new Scanner(System.in);

    boolean prisoner = true;
    char prisonerMovement;


    do{
      System.out.println("");
      printSlow("Use w,a,s,d to move direction");
      System.out.println("");

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'w'){
        printSlow("You moved up...");
        System.out.println("");

      }else if(prisonerMovement != 'w'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");

        continue;
      }

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'd'){
        printSlow("You moved right...");
        System.out.println("");

      }else if(prisonerMovement != 'd'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");

        continue;
      }

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'w'){
        printSlow("You moved up");
        System.out.println("");

      }else if(prisonerMovement != 'w'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");
        continue;
      }

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'a'){
        printSlow("You moved left");
        System.out.println("");

      }else if(prisonerMovement != 'a'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");

        continue;
      }

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'd'){
        printSlow("You moved right");
        System.out.println("");

      }else if(prisonerMovement != 'd'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");

        continue;
      }

      prisonerMovement = input.next().charAt(0);
      if(prisonerMovement == 'w'){
        printSlow("You moved up");
        System.out.println("");

      }else if(prisonerMovement != 'w'){
        printSlow("You fell in the sewage and alligators ate you. Start all over.");
        System.out.println("");

        continue;
      }
      prisoner = false;
    }while(prisoner);
  }

  public static void prisonBrawl(){
    String inventory[] = {"Fist", "Baton", "Pocket Knife"};
    String Prisoners[] = {"Walter", "Geo", "Dwayne"};

    System.out.println("");
    System.out.println("");
    System.out.println("This is yout battle inventory!");
    printSlow(inventory[0]);
    System.out.println("");
    printSlow(inventory[1]);
    System.out.println("");
    printSlow(inventory[2]);

    System.out.println("");
    System.out.println("These are your enemies!");
    printSlow(Prisoners[0]);
    System.out.println("");
    printSlow(Prisoners[1]);
    System.out.println("");
    printSlow(Prisoners[2]);

    System.out.println("");
    printSlow("These three prisoners never liked you while you were here"
    + " and now they are coming after you they have been waiting for you at"+
    " your prison cell. Win to escape your cell.");
    System.out.println("");
    Scanner input = new Scanner(System.in);
    boolean correctStyle = true;
    int tries = 0;
    System.out.println("");
    printSlow("You only have two attempts to get it right!");
    do {
      System.out.println("");
      printSlow("Your first opponent is Walter");
      System.out.println("");
      System.out.println("Please Enter a fighting choice from your inventory:");
      printSlow("How will you fight him? ");
      String fightingChoice = input.nextLine();

      if(inventory[0].equalsIgnoreCase(fightingChoice)) {
        System.out.println("");
        printSlow("You Knocked Out WALTER");
        System.out.println("");
        printSlow("Now Dwayne is coming after you! ");
        correctStyle = false;
        //boolean that sets this as an acceptable
      } else {
        System.out.println("This was the wrong weapon choice, TRY AGAIN");
        correctStyle = true;
        tries++;
        //boolean that sets this as an unacceptable
        if (tries > 1){
          System.out.println("");
          printSlow("You don't know how to fight... You LOSE!");
          System.exit(0);
        }
      }
      tries = 0;
    } while (correctStyle == true);
    do {
      printSlow("Dwayne has been working out non stop since he lost all his"
      + " money. He is too powerful for a normal fist fight.");
      System.out.println("");
      System.out.println("Please Enter a fighting choice from your inventory:");
      printSlow("How will you fight him? ");
      String fightingChoice = input.nextLine();

      if(inventory[2].equalsIgnoreCase(fightingChoice)) {
        System.out.println("");
        printSlow("You Cut Dwayne to PIECES!");
        System.out.println("");
        printSlow("Now skinny fast Geo is coming after you! ");
        correctStyle = false;
        //boolean that sets this as an acceptable
      } else {
        System.out.println("This was the wrong weapon choice, TRY AGAIN");
        correctStyle = true;
        tries++;
        //boolean that sets this as an unacceptable
      }
      if (tries > 1){
        System.out.println("");
        printSlow("You don't know how to fight... You LOSE!");
        System.exit(0);
      }
    } while (correctStyle == true);
    tries = 0;
    do {
      printSlow("Geo has been working on his cardio his entire time behind bars"
      + " he is too fast to hit or cut up.");
      System.out.println("");
      System.out.println("Please Enter a fighting choice from your inventory:");
      printSlow("How will you fight him? ");
      String fightingChoice = input.nextLine();

      if(inventory[1].equalsIgnoreCase(fightingChoice)) {
        System.out.println("");
        printSlow("You landed a deciding hit on Geo. You beat all the prisoners");
        System.out.println("");
        printSlow("You move on to the next stage. ");
        correctStyle = false;
        //boolean that sets this as an acceptable
      } else {
        System.out.println("This was the wrong weapon choice, TRY AGAIN");
        correctStyle = true;
        tries++;
        //boolean that sets this as an unacceptable
      }
      if (tries > 1){
        System.out.println("");
        printSlow("You don't know how to fight... You LOSE!");
        System.exit(0);
      }
    } while (correctStyle == true);

  }


}
