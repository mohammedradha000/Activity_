package class_work;

import java.util.Scanner;

public class Class_work {
public static void main(String[] args) {
             
    
Scanner input = new Scanner(System.in);

    
    
    
    
      Class_work_class watch1 = new Class_work_class(12,12,12);
      
      watch1.run();
     System.out.println("do you want to set time?");
         String choose = input.nextLine();

    
         
         
         if(choose.equals("yes")){

             
             
         System.out.println("hour:");
                  int hour1 = input.nextInt();
watch1.sethour(hour1);



         System.out.println("minute:");
                  int minute1 = input.nextInt();
watch1.setminute(minute1);



         System.out.println("second");
                  int second1 = input.nextInt();
watch1.setsecond(second1);




watch1.run();

     }
         
         
         
         else{
         System.out.println("congrats");
     }
      
      
      
  
}}