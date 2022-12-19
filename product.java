package siri;
import java.util.Scanner;
public class product {
	public static void main(String[] args) {
	       int prod_id ,quantity;   
    	   float prod_price;       
  	       String prod_name,category,brand; 
	    
	     
	    	 System.out.println(" storing of product information ");
	    	 Scanner b=new Scanner(System.in);
	    	 System.out.println("enter no of details");
	    	 int n=b.nextInt();
	    	 for(int i=0;i<n;i++)
	    	 {
	    		 System.out.println("enter product id");
	    		 prod_id=b.nextInt();
	    		 System.out.println("enter quantity");
	    		 quantity=b.nextInt();
	    		 System.out.println("enter product name");
	    		 prod_name=b.next();
	    		 System.out.println("enter category type");
	    		 category=b.next();
	    		 System.out.println("enter brand name");
	    		 brand=b.next();
	    		 System.out.println("enter product price");
	    		 prod_price=b.nextFloat();
	    	 
	    	 
	    		 System.out.println("product id :"+prod_id);
	   
	    		 System.out.println("quantity :"+quantity);
	   
	    		 System.out.println("product name "+prod_name);
	    		 
	    		 System.out.println("category :"+category);
	    	
	    		 System.out.println("brand :"+brand);
	    		 
	    		 System.out.println("product price :"+prod_price);
	    	 }
	    	   
	     }
}
	


