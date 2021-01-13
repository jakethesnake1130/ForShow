import java.util.Scanner;

public class RoadTripProject
{

   public static void main (String[] args)
   {
      //Initializing variables
      Scanner input  = new Scanner (System.in);
      String destination = "";
      double distance = 0;
      double limit = 0;
      double overLimit = 0;
      double timeSaved = 0;
      
      //Prompting and taking user inputs
      System.out.println("Please enter your destination:");
      destination = input.nextLine();
      System.out.println("How many miles is it to " + destination + "?");
      distance = input.nextDouble();
      System.out.println("What is the speed limit?");
      limit = input.nextDouble();
      System.out.println("How fast do you plan on driving over the speed limit?");
      overLimit = input.nextDouble();
      
      //Calculating the time saved by overLimit
      //First calculate the time it would take by driving the speed limit
      //Then calculate the time it will take by driving at the limit + how much the user will speed
      //Find the difference and multiply by 60 to convert from hours to minutes
      timeSaved = ((distance / limit) - (distance / (limit + overLimit))) * 60;
      
      //Print the total time it will take to arrive at the destination
      System.out.println("You will arrive in " + destination + " in " + ((distance / (limit + overLimit)) * 60) + " minutes.");
      //Use the calculation to print how much time will be saved by speeding
      System.out.println("You will save " + timeSaved + " minutes faster by driving " + overLimit + " mph over the speed limit");
      
      //Public service announcement
      if (overLimit >= 20)
      {
         System.out.println("Slow down, speed racer!");
      
      }
      
   
   }

}