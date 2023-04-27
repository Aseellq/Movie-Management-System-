/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;



public class Comedy extends Movies{
    
        protected String comedyName;
	
	

	public Comedy()
	{ 
	}
        
        //names of the Comedy movies 
	public void setComedyName(int comedyName)
	{
            
	    if (comedyName== 1)
	        this.comedyName ="I"; 
	    
	    else if (comedyName == 2)
	        this.comedyName="J"; 
            
            else if (comedyName == 3)
	        this.comedyName="K";
            
            else if (comedyName == 4)
	        this.comedyName="L";
	    
	}
        public String getComedyName()
	{
          return comedyName; 
	}
        
	public int getBookedComedy()
	{  
	   return bookedType;
	}
	public void setBookedComedy (int bookedComedy )
	{
	   super.bookedType = bookedComedy;
	}
          @Override
	 public void setPrice()
	{
	      super.price=200 ;
	}
         
           public int getSeats()
	{  
	   return seats;
	}
	public void seSeat (int seats )
	{
	   super.seats = seats;
	}

    
}
