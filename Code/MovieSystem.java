/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import java.util.List;

public class MovieSystem {

   
	        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	        Date date = new Date();
	        Client[] obj =  new  Client[100] ; 
	        Action [] arrmovieA = new Action [100];
	        Animation [] arrmovieN = new Animation [100];
	        Comedy [] arrmovieC = new Comedy [100];
	        Booking [] book = new Booking [100];
	        Payment [] payment = new Payment[100];
                Manager[] manager =  new  Manager[3] ;
	        Movies movie = new Movies(); 
	        String username="",password="",id="",phoneNum="",address=""; 
	        int  age=0 , num , choice=0, nn=0 , un=0, unA=0, movieC=0, typesOfAction=0, typesOfAnime= 0 , typesOfComedy= 0, numOfMovies= 0 , seatsA=0 , seatsN=0 , seatsC=0; 
	        boolean x=true, y = true;
                
                // create users for Admin 
	         manager[0] = new Manager();
	         manager[1] = new Manager();
	         manager[2] = new Manager();
	        // Manager 1
	            manager[0].setUsername("Dana");
	            manager[0].setPassword("123");
	            manager[0].setId("4587");
	            manager[0].setAge(38);
	            manager[0].setIPhoneNumber("+966 1225439874");
	            manager[0].setAddress("Dammam, Saudi Arabia");
	        // Manager 2    
	            manager[1].setUsername("Aseel");
	            manager[1].setPassword("O1234");
	            manager[1].setId("4588");
	            manager[1].setAge(41);
	            manager[1].setIPhoneNumber("+966 65209724");
	            manager[1].setAddress("Dhahran, Saudi Arabia");
	         // Manager 3
	            manager[2].setUsername("Manar");
	            manager[2].setPassword("Manar123");
	            manager[2].setId("4589");
	            manager[2].setAge(29);
	            manager[2].setIPhoneNumber("+966 986349724");
	            manager[2].setAddress("Khobar, Saudi Arabia");
                    
                    System.out.println("_______________________________________________________________");
	            System.out.println("\n                  Welcome To Movies System  ");
	            System.out.println("_______________________________________________________________");
	            System.out.println("\t***** Today Is: "+date+" ***** \n"); 
          do {          
          System.out.println("****** MENU ******\n1-Sign in. \n2-Sign up as a new client. \n3-sign in as manager.\n4-Exist");
	  System.out.print("\n"+"Please enter the number of your choice: ");
          x=true;
	    do{
	      choice=input.nextInt();
	      if(choice>=5 || choice<=0){
	         System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
	         choice=input.nextInt();
	      }else{x=false;}
	    }while(x);
            
            switch(choice){
                case 1:  /////////////////////// This case for students to sign in ////////////////////////////////////

	       if (Person.numOfUsers >=1){
	       boolean checkU = false, checkP = false, pass = false; 
	       do{
	         System.out.print("Enter Username:"); 
	         username = input.next();
	         System.out.print("Enter Password:"); 
	         password = input.next();
	         for (int i = 0 ; i< Person.numOfUsers; i++){
	            if (username.trim().equals(obj[i].getUsername())){
	              checkU =true; }
	            if (password.trim().equals(obj[i].getPassword()) ){
	              checkP =true; un= i ;  }    
	          }
	         if (checkU == true && checkP == true ){
	           System.out.println("\n✔✔✔✔ Log in SUCCESSFULLY ✔✔✔✔\n");
	           pass= true; 
	           }else{pass=false ; System.out.println("#####  Wrong Entry! ... Please Try Again  #####");}
	            
	       }while(pass== false ); 
	        // here 
	       lable: do{
	          System.out.println("▂ ▅ ▆ ▇ MENU ▇ ▆ ▅ ▂\n1-Show Profile. \n2-Update Profile. \n3-Delete Profile. \n4-Add Movie. \n5-Go to main page.");
	          System.out.print("\n"+"Please enter the number of your choice: ");
	          y=true;
	        do{
	            nn=input.nextInt();
	            if(nn>=6 || nn<=0){
	                System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
	                nn=input.nextInt();
	            }else{y=false;}
	        }while(y);
	        switch(nn){
	          case 1: 
	             System.out.println("User Name :  " + obj[un].getUsername()); 
	             System.out.println("ID :  " + obj[un].getId());  
	             System.out.println("Age :  " + obj[un].getAge()); 
	             System.out.println("Address :  " + obj[un].getAddress());  
	             System.out.println("Phone Number :  " + obj[un].getIPhoneNumber()); 
	             System.out.println("Number of movies :  " + obj[un].getNumberOfMovies());
	             if (arrmovieA[un].getBookedType() == 1){
	                    System.out.println("\n" );
	                 System.out.println(" -- Action Movie :  " );
	                 System.out.println(" Movie ID:  "  +arrmovieA[un].getMovieID() );
	                 System.out.println(" Your options are :  " );
	                 System.out.println(arrmovieA[un].getActionName());
	             }
	             
	             if (arrmovieN[un].getBookedType() == 1){
	                  System.out.println("\n" );
	                 System.out.println(" -- Anime Movie :  " );
	                 System.out.println(" Movie ID:  "  +arrmovieN[un].getMovieID() );
	                 System.out.println(" Your options are :  " );
	                 System.out.println( arrmovieN[un].getAnimeName() );
	                 
	             }
	             
	             if (arrmovieC[un].getBookedType() == 1){
	                    System.out.println("\n" );
	              System.out.println(" -- Comedy Movie :  " );
	                 System.out.println(" Movie ID:  "  +arrmovieC[un].getMovieID() );
	                 System.out.println(" Your options are :  " );
	                 System.out.println(arrmovieC[un].getComedyName());   
	                 
	             }
                     
	       
	             System.out.println("Total Price: " + book[un].getTotalPrice());
	          
	         
	             break;

	           case 2: 
	            int numUp;
	            System.out.println("Which information do you want to update?");
	            System.out.println(" MENU \n1-update UserName. \n2-update ID. \n3-update Age. \n4-update Address. \n5-update Phone Number .");
	            numUp=input.nextInt();
	            switch(numUp){
	                case 1: 
	                    System.out.println("update new User Name  : ");
	                    username=input.next();
	                    obj[un].setUsername(username);   
	                    break;
	                case 2:
	                    boolean qq=true;
	                    System.out.print("Update new ID:");
	                    id = input.next();
	                    if(Person.numOfUsers<=1)
	                        qq=false;
	                    while(qq){  
	                        qq=false;
	                        System.out.println("#####  WRONG ENTRY... Please enter unique ID #####"); 
	                        System.out.print("Update new ID:");
	                        id = input.next();       
	                        for (int i=0 ; i<Person.numOfUsers ; i++){
	                        if(id.trim().equals(obj[i].getId())){
	                             qq=true;}}
	                        }
	                     obj[un].setId(id);
	                     break;
	                case 3:
	                    boolean wx=true;int wq=0;String o = "";
	                    do{
	                      System.out.print("Enter New Age:"); 
	                       o=input.next();
	                       try {
	                       wq = Integer.parseInt(o); //this method to convert String to int, 
	                      //But if input is not int value then this will throws NumberFormatException. 
	                        System.out.println("Valid input");
	                        wx=false;
	                          }catch(NumberFormatException e) {
	                         System.out.println("input is not an int value"); 
	                        // Here catch NumberFormatException So input is not a int.
	                             } 
	                     }while(wx);
	                     age = wq;
	                     obj[un].setAge(age);
	                    break;
	                case 4:
	                    System.out.println(" update new Address :  ");
	                    address=input.next();
	                    obj[un].setAddress(address);
	                    break;
	                case 5:
	                  System.out.println(" update Phone Number  :  " );
	                  phoneNum=input.next();
	                  obj[un].setIPhoneNumber(phoneNum); 
	                  break;   
	             }
	            System.out.println(" \n UPDATED SUCCESSFULL \n " );
	            break;
	           case 3: 
	              for(int i=un ; i<Person.numOfUsers-1 ; i++){
	                obj[i]=obj[i+1];
	                
	                 }
	              Person.numOfUsers--;
	              System.out.println("\n✔✔✔✔ DELETE SUCCESSFULL ✔✔✔✔\n ");
	              break lable; 
	              
	              
	            // #####################################
	           case 4: 
	            System.out.println("Enter the number of movies you want to add:");
	             System.out.println("  \n1-Action. \n2-Anime. \n3-Comedy. ");
	             movieC = input.nextInt();
	             
	             
	             switch(movieC) {
	                 case 1: 
	                    if (arrmovieA[un].getBookedType() == 0){
	                       
	                       arrmovieA[un].setBookedAction(1); 
	                      
	                      System.out.println("choose\n1-A\n2-B\n3-C\n4-D");
	                      typesOfAction=input.nextInt();
                              System.out.println("number of seats:");
	                      seatsA=input.nextInt();
	                      arrmovieA[un].setActionName(typesOfAction);
                              // movie catagory ID
	                      arrmovieA[un].setMovieID("1111"); 
	                      arrmovieA[un].setPrice();
                              arrmovieA[un].seSeat(seatsA);
	                      
	                       System.out.println("successfuly added  Avtion Movie")  ;
	                       System.out.println("Movie ID" + arrmovieA[un].getMovieID())  ;
	                       System.out.println("Movie Price " + arrmovieA[un].getPrice() )  ;
	                       obj[un].setNumberOfMovies(obj[un].getNumberOfMovies()+1)  ; 
	                       
	                       
	                         
	        	   
	        	   System.out.println("\nAdding new Booking...");
	        	book[un].addNewOrder(un, obj[un].getNumberOfMovies(), date, (int) arrmovieA[un].getBookedType()
                                , arrmovieA[un].getMovieID(), (int) arrmovieC[un].getBookedType(), arrmovieC[un].getMovieID()
                                , (int) arrmovieN[un].getBookedType(), arrmovieN[un].getMovieID(),arrmovieA[un].getPrice()
                                ,arrmovieN[un].getPrice(),arrmovieC[un].getPrice() , seatsA , seatsN , seatsC);
	        	   //Payment
	              
	               payment[un].paymentMethod(); 
	                obj[un].setTotalPrice(book[un].getTotalPrice());
                        
	                       
	                       }
	                       
	                     
	                       else 
	                      System.out.println("Sorry, Movie alredy have been taken ");
	                     
	                  break ;  
	                  
	                   case 2: 
	                       
	                       if (arrmovieN[un].getBookedType() == 0){
	                       
	                       arrmovieN[un].setBookedAnime(1); 
	                       
	                      
	                     
	                      
	                      System.out.println("choose \n1-E \n2-F\n3-G\n4-H");
	                      typesOfAnime=input.nextInt();
                              System.out.println("number of seats:");
	                      seatsN=input.nextInt();
	                      arrmovieN[un].setAnimeName(typesOfAnime);
	                      arrmovieN[un].setMovieID("2222"); 
	                      arrmovieN[un].setPrice();
                              arrmovieN[un].seSeat(seatsN);
	                      
	                       System.out.println("successfuly added  Animation movie")  ;
	                       System.out.println("Movie ID" + arrmovieN[un].getMovieID())  ;
	                       System.out.println("Movie Price " + arrmovieN[un].getPrice() )  ;
	                       obj[un].setNumberOfMovies(obj[un].getNumberOfMovies()+1)  ; 
	                       
	                       
	                        
	        	   System.out.println("\nAdding new order...");
                           book[un].addNewOrder(un, obj[un].getNumberOfMovies(), date, (int) arrmovieA[un].getBookedAction()
                                , arrmovieA[un].getMovieID(), (int) arrmovieC[un].getBookedComedy(), arrmovieC[un].getMovieID()
                                , (int) arrmovieN[un].getBookedAnimation(), arrmovieN[un].getMovieID(),arrmovieA[un].getPrice()
                                ,arrmovieN[un].getPrice(),arrmovieC[un].getPrice(), seatsA , seatsN , seatsC);
                           //Payment
	              
	               payment[un].paymentMethod(); 
	                obj[un].setTotalPrice(book[un].getTotalPrice());
	                       
	                       }
	                       
	                       else 
	                      System.out.println("Sorry, Movie alredy have been taken ");
	                      
	                  break ; 
	                  
	                   case 3: 
	                      if (arrmovieC[un].getBookedType() == 0){
	                       
	                       arrmovieC[un].setBookedComedy(1);
	                      
	                      System.out.println("choose \n1-I \n2-J\n2-K\n2-L");
	                      typesOfComedy=input.nextInt();
                              System.out.println("number of seats:");
	                      seatsC=input.nextInt();
	                      arrmovieN[un].setAnimeName(typesOfComedy);
	                      arrmovieN[un].setMovieID("3333"); 
	                      arrmovieN[un].setPrice();
                              arrmovieN[un].seSeat(seatsC);
	                      
	                       System.out.println("successfuly added  Comedy movie")  ;
	                       System.out.println("Movie ID" + arrmovieN[un].getMovieID())  ;
	                       System.out.println("Movie Price " + arrmovieN[un].getPrice() )  ;
	                       obj[un].setNumberOfMovies(obj[un].getNumberOfMovies()+1)  ; 
	                       
	                       
	                       
	                         
	        	   
	        	   System.out.println("\nAdding new order...");
                           book[un].addNewOrder(un, obj[un].getNumberOfMovies(), date, (int) arrmovieA[un].getBookedAction()
                                , arrmovieA[un].getMovieID(), (int) arrmovieC[un].getBookedComedy(), arrmovieC[un].getMovieID()
                                , (int) arrmovieN[un].getBookedAnimation(), arrmovieN[un].getMovieID(),arrmovieA[un].getPrice()
                                ,arrmovieN[un].getPrice(),arrmovieC[un].getPrice(), seatsA , seatsN , seatsC);
                           //Payment
	               
	               payment[un].paymentMethod(); 
	                obj[un].setTotalPrice(book[un].getTotalPrice());
	                       
	                       }
	                     
	                       else 
	                      System.out.println("Sorry, Movie alredy have been taken ");
	                  break ;    
	             }
	             
	          
	           
	             break; 
	             //#########################################################################################
	           
	           
	           case 5: 
	            
	             break; 
	        } 
	        if (nn == 5)
	          break lable; 
	       //here 
	             }while(true); 
	        }
               else{
	         System.out.println("There is no users yet Sorry !");
	         nn=5; 
	        }
	         
	        break ;
                
                
                case 2: /////////////////////////// This case for client to sign up ////////////////////////////////////
                    //here 
	      int add; 
	      lable: do{
	        Person.numOfUsers ++; 
	        num=Person.numOfUsers-1;
	        obj[num] = new Client();
	        arrmovieA[num]=new Action();
	        arrmovieN[num]=new Animation();
	        arrmovieC[num]=new Comedy();
                 book[un]= new Booking();
	         payment[un]= new Payment();
	        System.out.print("Enter Username:"); 
	        username = input.next();
	        obj[num].setUsername(username);
	        System.out.print("Enter Password:"); 
	        password = input.next();
	        obj[num].setPassword(password);
	        
	        System.out.print("Enter ID:");
            id = input.next();
            int idcheck=0;
            for (int i=0; i<Person.numOfUsers; i++)
              if (id.trim().equals(obj[i].getId()))
               idcheck= 1;
            while(idcheck != 0){  
                System.out.println("#####  WRONG ENTRY... Please enter unique ID #####"); 
                System.out.print("Enter ID:");
                id = input.next();
                for (int i=0 ; i<Person.numOfUsers; i++)
                    if(id.trim().equals(obj[i].getId()))
                        idcheck+=1;

                if ( idcheck==1 )  
                    idcheck = 0;
                else
                    idcheck = 1;
            }
            obj[num].setId(id);
	        
	        boolean ww=true;int w1=0;String w = "";
	        do{
	          System.out.print("Enter Age:"); 
	          w=input.next();
	          try {
	            w1 = Integer.parseInt(w); //this method to convert String to int, 
	            //But if input is not int value then this will throws NumberFormatException. 
	            System.out.println("Valid input");
	            ww=false;
	          }catch(NumberFormatException e) {
	            System.out.println("input is not an int value"); 
	             // Here catch NumberFormatException So input is not a int.
	          } 
	        }while(ww);
	        age = w1;
	        obj[num].setAge(age);
	        System.out.print("Enter Phone number:"); 
	        phoneNum = input.next();
	        obj[num].setIPhoneNumber(phoneNum);
	        System.out.print("Enter Address:"); 
	        address = input.next();
	        obj[num].setAddress(address);
	        System.out.println("\n✔✔✔✔ ADDED SUCCESSFULLY ✔✔✔✔\n");
	        //here
	        System.out.println("Do you want to add new user ? (1 for Yes or 2 No )");
	        add = input.nextInt(); 
	        if (add == 2)
	           break lable; 
	        }while(true); 
	        break;
                    
            
            case 3://///////////////////////// This case for manager to sign in //////////////////////////////////////// 
	      // begin 
	      boolean checkA = false, checkE = false, pass = false; 
	      do{
	         System.out.print("Enter Username:"); 
	         username = input.next();
	         System.out.print("Enter Password:"); 
	         password = input.next();
	         for (int i = 0 ; i<3; i++){
	            if (username.trim().equals(manager[i].getUsername())){
	               checkA =true; }
	            if (password.trim().equals(manager[i].getPassword()) ){
	               checkE =true; unA= i ;  }    
	         }
	         if (checkA == true && checkE == true ){
	            System.out.println("\n✔✔✔✔ Log in SUCCESSFULLY ✔✔✔✔\n");
	            pass= true; 
	            }else{pass=false; System.out.println("#####  Wrong Entry! ... Please Try Again  #####");}
	       }while(pass== false ); 
	       // here 
	      lable: do{
	        System.out.println("▂ ▅ ▆ ▇ MENU ▇ ▆ ▅ ▂\n1-Show Profile. \n2-Show Details. \n3-Show employee info. \n4-show client info \n5-Go to main page.");
	        System.out.print("\n"+"Please enter the number of your choice: ");
	        y=true;
	        do{
	          nn=input.nextInt();
	          if(nn>=6 || nn<=0){
	            System.out.println("#####  WRONG ENTRY... Please try again  #####");
	            nn=input.nextInt();
	            }else{y=false;}
	        }while(y);
	        switch(nn){
	            case 1: 
	             System.out.println("Manager Name :  " + manager[unA].getUsername()); 
	             System.out.println("ID :  " + manager[unA].getId());  
	             System.out.println("Age :  " + manager[unA].getAge()); 
	             System.out.println("Address :  " + manager[unA].getAddress());  
	             System.out.println("Phone Number :  " + manager[unA].getIPhoneNumber()); 
	             System.out.println("Working Hours :  " + manager[unA].getWorkingHoursA()); 
	             System.out.println("Total Income :  " + manager[unA].getTotalIncomeA()); 
	             System.out.println("\n");
	            break; 
	           case 2: 
	                 
	             manager[unA].showDetails(); 
	            break; 
	           case 3: 
	            manager[unA].employee();
	            break; 
	           case 4: 
	              String Id=""; boolean istrue=true; int no=0; 
	              do{  
	                  System.out.println("Please Enter The Client ID: ");
	                  Id=input.next();
	                  for (int i=0 ; i<Person.numOfUsers ; i++)
	                    if(Id.equals(obj[i].getId())){
	                        istrue=false;
	                        no=i;
	                    }
	                  if(istrue==true)
	                      System.out.println("#####  WRONG ENTRY... Please try again  #####");

	                 }while(istrue); 
	               
	            manager[unA].client(obj , no);
	            break; 
	           case 5: 
	            
	            break;  
	          } 
	          if (nn == 5)
	              break lable; 
	          //here 
	            }while(true); 
	          
	          
	            // end
	           break ; 
                   
            case 4:
                choice = 4;
                break;
            }
            
            
          }while((nn == 5 || nn == 3 || choice == 2) && choice!=4 );
    
}
}
