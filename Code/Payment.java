/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;


import java.util.Scanner;
public class Payment {
    Scanner input = new Scanner(System.in);
		
		 public int paymentType; 
		 
		 public Payment()
		 {
		 }

		 // To ask the user about payment method he prefer
		 public void paymentMethod()
		 {
			 System.out.println("Please choose Payment Method:\n 1.Credit card \n 2.Paypal \n 3.Bank transfer");
			 paymentType= input.nextInt();
			 switch(paymentType)
			 {
			 	case 1:  System.out.println("Your choice for Payment Method: Credit card \n"); break;
			 	case 2:  System.out.println("Your choice for Payment Method: Paypal \n"); break;
			 	case 3:  System.out.println("Your choice for Payment Method: Bank transfer \n"); break;
			 	default: while(paymentType!=1 || paymentType!=2 || paymentType!=3 )
			 		       System.out.println("Your choice is invalid, enter again your choice (1-3)\n"); break;
			 }
		 } 

    
}
