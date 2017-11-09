/**
 * John Kluck
 */
import java.util.*;

public class Average {

    public static Scanner kbd;

    //set MAXSIZE constant
    public static final int MAXSIZE = 10;

    public static void main(String[] args) {
        //initialize variables
        int total = 0;
        double average = 0;
        int avgCount = 0;

        kbd = new Scanner(System.in);

        //create array
        int numbers[] = new int[MAXSIZE];

        //get user input        
        System.out.println("Enter " + MAXSIZE + " integers:\n");

        for (int i = 0; i < MAXSIZE; i++) {

            //get each number and store it in an array
            numbers[i] = kbd.nextInt();
            //keep a running total
            total += numbers[i];
        }
        //divide the total by MAXSIZE to get average
        average = (double)total / (double)MAXSIZE;

        for (int i = 0; i < MAXSIZE; i++) {

            //if number in array is above the average, increment the count 
            if (numbers[i] > average) {
                avgCount++;
            }
        }
        //initialize variable and array to store above average numbers
        int aboveAvg[] = new int[avgCount];
        int internalCounter = 0;

        for (int i = 0; i < MAXSIZE; i++) {

            //store numbers above the average
            if (numbers[i] > average) {
                aboveAvg[internalCounter] = numbers[i];
                internalCounter++;

            }
        }

        //display average
        System.out.println("The average of your numbers is: " + average + "\n");

        //grammer check for 1 above average
        if (avgCount == 1) {
            System.out.println("There is 1 number above the average.\n");
            //display the number above the average
            System.out.println("That number is: " + aboveAvg[0]);

        } else {
            System.out.println("There are " + avgCount + " numbers above the average.\n");
            System.out.println("Those numbers are: ");

            //loop to display values in the array of numbers above the average
            for (int x = 0; x < avgCount; x++) {
                System.out.println(aboveAvg[x]);
            }
        }

        kbd.close();
    }
}