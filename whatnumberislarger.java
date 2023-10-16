import java.util.Scanner; //initialize the scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in); //declare scanner

System.out.println("Enter Number 1: "); //ask user for the 1 number

int num1 = value.nextInt(); //take input from user

System.out.println("Enter Number 2"); //ask user for 2 number

int num2 = value.nextInt(); //take input from user

if (num1 > num2) {
  System.out.println(num1 + " is greater than " + num2); //prints this if the 1 number is greater than the 2
} else if (num1 < num2) {
  System.out.println(num1 + " is less than " + num2); //prints this statement if the 2 number is greater then the 1
} else {
  System.out.println(num1 + " is equal to " + num2); //prints this if both the numbers share the same value
}



  } 
}
