import java.util.Scanner; 

package ncNatureNetwork;

public class nnnClass
{ 
	
	public static void main(String[] args) 
	{ 
	 			
		
		 Scanner scan = new Scanner(System.in); 
		 
		 String systemResponse;
		 
		 System.out.println("Hello!\n" + "    \n" +  "Enter your zip code:");
		 
				 
		 int userZip = scan.nextInt();
		 
		  
		 if (userZip == 1) 
		    systemResponse = "s1"; 
		 else if (userZip == 2) 
		    systemResponse = "s2"; 
		 else if (userZip == 3) 
		    systemResponse = "s3"; 
		
		
		 System.out.println("These are the snakes in your area: " + systemResponse); 
	
		}

}
