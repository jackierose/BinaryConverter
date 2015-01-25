 // Project Binary Counter
 
 import java.util.Scanner; 
 import java.util.Arrays;
 // imports ^^^^
 
 
 
 public class BinaryCounter {
     
     public static int renum = 0; 
     
     public static String converter(int num) {
         String binary = "";
         if(num == 0) {
          binary = binary + 0;
          return binary;
         } //close if loop
         
         
         while(num != 0) { //loop will continually divide the number 
         if (num % 2 != 0) { //will check to see if it need to put a 1 or 0
             binary = 1 + binary;
         } //close if statement
         else { // this will add a 0 if it won't have a remander
             binary = 0 + binary;
         } //close else statement
         
         num = num/2; //divids to get the next number for the loop
         
         } //close while loop
         
         
         return binary;
         
     } //close converter method
     
     
     public static String negConvert(int num) { //change to array!!! And index into an array instead.
      num = Math.abs(num);
      String numb = converter(num);
      System.out.println("THIS IS NUM BEFOR THE ZEROS   " + numb);
      while(numb.length()%4 != 0) {//this completes the binary number to have a full line
       numb = 0 + numb;
      } //close while loop
      System.out.println("BINARYNUM BEFORE CONVERSION   " + numb);
      char[] Array = numb.toCharArray();
      for (int i = 0; i < Array.length; i++) {
       if(Array[i] == '1') { // will flip the bits
        Array[i] = '0';
       } //close if statement
       else {
        Array[i] = '1';
       } //close else statement
      } //close for loop
      if(Array[Array.length - 1] == '1') {
       Array[Array.length] = '0';
       for(int x = Array.length -2; x >= 0; x--) {
        
       } //close for loop
      } //close if statement
      else {
       Array[Array.length - 1] ='1';
      } //close else statement
      String end = ""; //remember you can't use key word final
      for (int j = 0; j < Array.length; j++) {
       end = end + Array[j];
      } //close for loop
      return end;
     } //close negConvert
     
     
     public static void main(String[] args) {
         String answer; //answer has to be declared up here because of the scope
         System.out.printf("Welcome to the Binary Converter! \n");
         do {
         System.out.printf("What number would you like to be converted to binary? \n");
         Scanner s = new Scanner(System.in);
         int number = s.nextInt();
         System.out.printf("The binary number is: \n");
         if (number >= 0) { // figures out if number is negative so it's put in the right method
         System.out.printf(converter(number)+ "\n");
         } //close if statement
         else {
          System.out.printf(negConvert(number) + "\n");
         } //close else statement
         System.out.printf("Would you like to compute another number? (yes or no) \n");
         Scanner a = new Scanner(System.in); //checks to see if user wants to do another number
         answer = a.nextLine();
         } while (answer.equals("yes"));
         //exits
         System.out.printf("Thank you for using the Binary Converter! \n");
         
         //closes do-while loop
         
     } //close main
     
 } //close Binary Counter
 
 /**
  * THINGS THAT I LEARNED:
  * -final is keyword and can not be used as a variable name
  * -be carful where you put intiated variables because if they are put public
  * they may add on old data and information
  * 
  * 
  */ 
  
  /**
   * THINGS THAT CAN IMPROVE ON IN PROGRAM:
   * -there are certain corner cases not covered
   *    -if the person doesn't put in a number the program should reject what they put in
   *    -if the person doens't put no or yes in the program should ask again
   *    -what about big numbers and overflow...?
  