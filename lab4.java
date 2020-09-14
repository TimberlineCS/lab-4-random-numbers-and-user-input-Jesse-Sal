import java.io.*;
import java.util.*;

public class lab4{
  public static void main(String args[]){
    //Number generator
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a negative number");
    int negative = s.nextInt();
    System.out.println("Please enter a positive number greater than " + negative*-1);
    int positive = s.nextInt();
    int first = (int)(Math.random()*positive) + negative;
    int second = (int)(Math.random()*positive) + negative;
    System.out.println("Your lucky numbers are: " + first + " and " + second);




    //Mad libs
    

  }
}