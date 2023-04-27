/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Booking extends Movies {
    
    Scanner input= new Scanner(System.in);
                public ArrayList<Integer> bookingID;
		public int ID;
		public Action action;
		public Comedy comedy;
		public Animation anime;
                private int seats = 0;
                private double totalPrice=0 ;
		public static final double VAT = 0.15;
                
                public Booking() 
		{
			bookingID = new ArrayList<Integer>();
			action = new Action();
			comedy = new Comedy();
			anime = new Animation();
		}
                // Working as bill to the user for movies he added, contains all details
		public void addNewOrder(int un, int numberOfMovies, Date date, int bookAction ,String actionID,
				int bookComedy, String comedyID,
				int bookAnime, String animeID ,double priceAction, double priceAnime , double priceComedy , int seatsA ,
                                int seatsN , int seatsC)
		{
			bookingID.add(ID+1);
			ID++;
			System.out.println("\nYour booking ID #" + bookingID);
			System.out.println("_________________________________________________\n\n");
			System.out.println("Number of movies you have: "+ numberOfMovies + "\nMovies/ Movies:\n----------");
			
			if (bookAction == 1)
				{
				totalPrice +=  (priceAction*seatsA);
				System.out.println("	Action Movie:");
				System.out.println("	Movie ID: " + actionID);
				System.out.println("	Movie Price: " + priceAction+ "\n");
				}
			
			if (bookComedy == 1)
			{
                         totalPrice +=(priceComedy*seatsC);
                         System.out.println("	Comedy Movie:")  ;
                         System.out.println("	Movie ID: " + comedyID);
                         System.out.println("	Movie Price: " + priceComedy + "\n")  ;
			}
			
			if (bookAnime == 1)
			{
			totalPrice += (priceAnime*seatsN);
			System.out.println("	Animation Movie:")  ;
                        System.out.println("	Movie ID: " +  animeID);
                        System.out.println("	Movie Price: " + priceAnime + "\n");
			}
			
			System.out.println("Date created: "+ date);
			
			System.out.println("\nYour total price(movie price with number of seats) without VAT: " + totalPrice + " SAR");
			System.out.println("VAT:  " + (totalPrice * VAT) + " (15%) SAR");
			System.out.println("___________\nYour total price with VAT:  " + (totalPrice + (totalPrice * VAT) ) + " SAR\n");  
			
		}
                
                 // Takes the total price that was counted in addNewBooking method
		public double getTotalPrice()
		{
			return  (this.totalPrice + (this.totalPrice * VAT) );
		}
    
}
