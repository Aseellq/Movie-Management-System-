/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;


public class Action extends Movies{
    
        protected String actionName;
	

	public Action()
	{ 
	}
        
        //names of the action movies 
	public void setActionName(int actionName)
	{
            
	    if (actionName== 1)
	        this.actionName ="A"; 
	    
	    else if (actionName == 2)
	        this.actionName="B"; 
            
            else if (actionName == 3)
	        this.actionName="C"; 
            
            else if (actionName == 4)
	        this.actionName="D"; 
	    
	}
        public String getActionName()
	{
          return actionName; 
	}
        
	public int getBookedAction()
	{  
	   return bookedType;
	}
	public void setBookedAction (int bookedAction )
	{
	   super.bookedType = bookedAction;
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
