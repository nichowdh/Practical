import java.io.Console;

class ReadStringTest{    

public static void main(String args[]){    

Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine(); 
System.out.println("Enter password: ");    
char[] ch=c.readPassword();    
String pass=String.valueOf(ch); //convertingchar array into string    

System.out.println("Welcome "+n);  
System.out.println("Password is: "+pass);  

}    
}