/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;

public class Movies {
           private String movieID ;
           public int bookedType =0 ; 
           int count=0;
           public double price;
           public int seats;
           
	  public Movies()
	{ 
	}  
	   
        public void setPrice()
	{
	      this.price=0;
	}
        
         public void setSeats()
	{
	      this.seats=0;
	}
	    
	
	 public String getMovieID ()
	{
	     return movieID ;
	}
	public void setMovieID ( String movieID)
	{
	     this.movieID = movieID ;
	}
	public double getPrice()
	{
	  return price;
	}
        public int getSeats()
	{
	  return seats;
	}
        // booked type is : 1-action , 2-comedy , 3-animation
        public int getBookedType()
	{
	  return bookedType;
	}
         public void setBookedType(int bookedType)
	{
	  this.bookedType = bookedType ;
	}
}
