/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;


public class Animation extends Movies {
    protected String  animeName;
	

	public Animation()
	{ 
	}
        
        //names of the anime movies 
	public void setAnimeName(int  animeName)
	{
            
	    if ( animeName== 1)
	        this.animeName ="E"; 
	    
	    else if ( animeName == 2)
	        this.animeName="F";
            
            else if ( animeName == 3)
	        this.animeName="G";
            
            else if ( animeName == 4)
	        this.animeName="H";
            
	    
	}
        public String getAnimeName()
	{
          return  animeName; 
	}
        
	public int getBookedAnimation()
	{  
	   return bookedType;
	}
	public void setBookedAnime (int bookedAnime )
	{
	   super.bookedType = bookedAnime;
	}
          @Override
	 public void setPrice()
	{
	      super.price=150 ;
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
