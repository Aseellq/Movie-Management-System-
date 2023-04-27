/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesystem;

public class Person {
    private String id;
    private String username; 
    private String password; 
    private int age;
    private String phoneNum; 
    private String address ; 
    public static int numOfUsers = 0;
    public int numberOfMovies;
    
    
    public Person(){}
    public Person(String username, String password, String id,int age,String phoneNum,String address)
{
    this.username=username;
    this.password=password;
    this.id=id;
    this.age=age;
    this.phoneNum=phoneNum;
    this.address=address;
}
public String getId() {
        return this.id;
}
public String getUsername() {
    return this.username;
}
public String getPassword() {
    return this.password;
}
public int getAge() {
    return this.age;
}
public String getIPhoneNumber () {
    return this.phoneNum;
}
public String getAddress() {
    return this.address;
}
public int getNumberOfMovies() {
    return this.numberOfMovies;
}
public void setId(String id) {
    this.id=id;
}
public void setUsername(String username) {
    this.username=username;
}
public void setPassword(String password) {
    this.password=password;
}
public void setAge(int age) {
    this.age=age;
}
public void setIPhoneNumber(String phoneNum) {
    this.phoneNum=phoneNum;
}
public void setAddress(String address) {
    this.address = address;
}
public void setNumberOfMovies(int numberOfMovies) {
    this.numberOfMovies = numberOfMovies;
}
   
}
class Manager extends Person {
    public double totalIncomeA; 
    private int workingHoursA = 10;
    
    public Manager () {
    } 
    public double getTotalIncomeA () {
        return this.totalIncomeA;
    }
    public int getWorkingHoursA () {
        return this.workingHoursA;
    }
    public void setTotalIncomeA (double totalIncome) {
        this.totalIncomeA=totalIncome;
    }
    public void setWorkingHoursA (int workingHoursA) {
        this.workingHoursA=workingHoursA;
    }
    protected void showDetails () { // this method to show manager the main details for the movie shows
        System.out.println("\nNumber of  employees is 3");
        System.out.println("Number of  movie catagory is 3");
        System.out.println("Total Number of Clients: "+ Person.numOfUsers+"\n");
        
    }
    protected void employee () { // this method to show each employee information
        System.out.println("\nEmployee1:");
        System.out.println("\tName: Mohammed  Al-Omar");
        System.out.println("\tPhone Number:  +966 128457398");
        System.out.println(" ------------------------");
        System.out.println("Employee2:");
        System.out.println("\tName: Mubarak Al-Ajmi ");
        System.out.println("\tPhone Number:  +966 835308361");
        System.out.println(" ------------------------");
        System.out.println("Employee3: ");
        System.out.println("\tName: Mohammed  Al-Omar");
        System.out.println("\tPhone Number:  +966 863354864 \n\n");
   
    }
    protected void client (Client[] obj , int no) { // this method to show  information for the client using ID 
        System.out.println("Name :  " + obj[no].getUsername()); 
        System.out.println("ID :  " + obj[no].getId());  
        System.out.println("Age :  " + obj[no].getAge()); 
        System.out.println("Address :  " + obj[no].getAddress());  
        System.out.println("Phone Number :  " + obj[no].getIPhoneNumber()); 
        System.out.println("Number of movies :  " + obj[no].getNumOfMovies());
        System.out.println("NTotal Price :  " + obj[no].getTotalPrice() +"\n\n");
 } }


class Client extends Person {
    private int numOfMovies; 
    private double totalPrice;
    public Client() {
    }

    Client(String username, String password, String id1, int age, String phoneNum, String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getNumOfMovies() {
        return this.numOfMovies;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    public void setNumOfMovies(int numOfMovies) {
        this.numOfMovies=numOfMovies;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice=totalPrice;
   } 
}



