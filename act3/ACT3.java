package act3;
import java.util.Scanner;
public class ACT3 {
public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
     int accountNumber;
     double Balance;
     
     
     accountclass obj=new accountclass();
     obj.setBalance(100);
     
     System.out.println("how much money you wanna cash out?");
double mon=input.nextDouble();
     obj.debit(mon);
     System.out.println("your balance is equal to:"+obj.getBalance());
  

    
}}
