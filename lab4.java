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

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    //Mad libs
    Scanner s2 = new Scanner(System.in);
    System.out.println("Please enter a noun");
    String noun = s2.nextLine();

    System.out.println("Please enter a body part");
    String bodyPart = s2.nextLine();

    System.out.println("Please enter a noun");
    String noun2 = s2.nextLine();

    System.out.println("Please enter an adjective");
    String adjective = s2.nextLine();

    System.out.println("Please enter an emotion");
    String emotion = s2.nextLine();

    System.out.println("Please enter an adjective relating to size");
    String sizeAdjective = s2.nextLine();

    System.out.println("Please enter an adjective");
    String adjective2 = s2.nextLine();

    System.out.println("Please enter an animal");
    String animal = s2.nextLine();

    System.out.println("Please enter a whole number");
    int age = s2.nextInt();

    System.out.println("Please enter a number with a decimal point");
    double time = s2.nextDouble();

    double wasted = age + time;

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.print("The man lived in a(n) " + noun +". It wasnt much, but he put his " + bodyPart + " and " + noun2 + " into making his " + noun + " look " + adjective + ". The man was " + emotion + " until one day a(n) " + sizeAdjective + " " + adjective2 + " " + animal + " came and destroyed the man's " + noun + ". It took him " + age + " years to rebuild and " + time + " years to hunt the " + animal + ". He wasted " + wasted + " years because of that " + animal);


  
    /*
    The man lived in a(n) NOUN. It wasnt much but he put his BODYPART and NOUN2
    into making his NOUN look ADJECTIVE. The man was EMOTION unill one day a(n) ADJECTIVE_ABOUT_SIZE ADJECTIVE2 ANIMAL came and destroyed the man's NOUN. It took him INT years to rebuild and DOBULE years to hunt the ANIMAL. He wasted INT+DOUBLE years because of that ANIMAL.

    */
  }
}