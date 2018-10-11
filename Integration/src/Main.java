import java.util.Random;

// Karan Patel
/*Ideas for the integration Projects in COP 2006: Follow each week tasks for the project 
from the course web site */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to my project");
        
        
        String myString = "My name is Karan :)"; //it is sequence of characters (some kind of constant or variable)
            System.out.println(myString);
        
        
        int myNumber = 7; //only stores integral values, that is whole number like 5, 10, 100
        short myShort = 700; //contains length of 16 bits: (2^16), values between -32768 to 32767 
        long myLong = 7000; //contains length of 64 bits: (2^64), values between -2^64 to 2^64 -1
        double myDouble = 17.5; //can hold floating values like 8.7, 12.5, 100.100
        
        float myFlaot = 7.55f; //stores floating-point that is values that have potential decimal places
        char myChar = 'K'; //it provides an internal representation of printable characters
        boolean myBoolean = true; //only stores true or false
        boolean myBoolean1 = myNumber > myShort; 
        byte myByte = 70; //contains length of 8 bits witch is (2^8)-1, value between -128 and 127  
        
            System.out.println("Interger = " +myNumber);
            System.out.println("Short = " +myShort);
            System.out.println("Long = " +myLong);
            System.out.println("Double = " + myDouble);
            System.out.println("Float = " +myFlaot);
            System.out.println("Char = " +myChar);
            System.out.println("Boolean = " +myBoolean);
            System.out.println("myNumber > myShort is " +myBoolean1);
            System.out.println("Byte = " +myByte);
        
        //A variable is a piece of memory that can contain a data value. A variable thus has a data type.
        //A scope refers to the lifetime and accessibility of a variable. How large the scope is depends on where a variable is declared.
        
            
        final int i = 8;
        System.out.println("i = " +i);
        
        /*Final keyword has a numerous way to use:
         * A final class cannot be sub-classed.
         * A final method cannot be overridden by subclasses.
         * A final variable can only be initialized once.
         */
        
        
        //String Methods: length, valueOf, equals, substring, compareTo, toUpperCase
        
        System.out.println("My String length, character, indexOf = " +myString.length() +", " + myString.charAt(4) + ", " + myString.indexOf("K"));
        
        
        /*In Java Programming language, String are treated as objects. 
         * The String class is immutable, so that once it is created a String object cannot be changed.
         * For example:(The string method I used)
         *      length() = It count number of character/letter used in my String variable.
         *      charAt() = Returns the character at the specific index.
         *      indexOf() = Returns the index within this String of the first occurrence of the specified substring.
         * 
         */
        
        System.out.println("This\n\tis\n\t\t\"AWESOME!\"");
        
        
        int casting = (int)myDouble;
        System.out.println(casting);
        //Casting means taking object of one particular type and turning it into another object type
        //dataType variablename = (dataType) variableToConvert
        
        Random number = new Random();
        int randnum = number.nextInt (10);
        System.out.println("Random Number = "+randnum);
        
        double newNum = myNumber*Math.PI;
        System.out.println(newNum);
        
        if(randnum < 5) {;
            System.out.println("Random Number is less than 5");
        }
        
        String result = randnum < i ? "randnum is smaller than i" : "randnum is greater than i"; //i=8
        System.out.println(result);
        
        if (myNumber == randnum) {
            System.out.println("mynumber is equal to randnum");
        }
        else if (myNumber < randnum) {
            System.out.println("myNumber is less than randnum");
        }
        else {
            System.out.println("myNumber is greater than randnum");
        }
        
        
        String str1 = "Strings are immutable";
        String str2 = "Integers are not immutable";
        int strResult = str1.compareTo(str2);
        System.out.println(strResult);
        boolean strResult2 = str1.equals(str2);
        System.out.println(strResult2);
        
        /* equal to (==), checks if the values of two operands are equal or not,
         * if yes then condition becomes true. */
        
        String abc = "ABC";
        char letter = abc.charAt(number.nextInt(abc.length()));
        
        switch (letter) {
        case 'A':
            System.out.println('A');
            break;
        case 'B':
            System.out.println('B');
            break;
        case 'C':
            System.out.println('C');
            break;
        }
        System.out.println("Guess the grade you will get: " +letter);
        
        int sum = myNumber + i;
        System.out.println("My Sum = "+ ++sum);
        int differ =sum + myNumber - i;
        System.out.println("My Difference = "+ --differ);
        System.out.println("Other Relations: "+ sum*differ +", "+ sum % differ +", "+ sum / differ);
        System.out.println(myNumber += differ);
        
        
        
        
    }
    
}

