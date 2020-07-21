package Assignment3;

	import java.util.*;
	public class Product {
		public static void main(String args[])
		{
			Product o=new Product("Computer",43000.25,'A');
			Product object=new Product("Laptop",67000.23);
			System.out.println(" Product Code : "+o.getProductCode());
			System.out.println(" Name : "+o.getProductName());
			System.out.println(" Price : "+o.getProductPrice());
			System.out.println(" Category : "+o.getCategoryCode());
			
			System.out.println(" Product Code : "+object.getProductCode());
			System.out.println(" Name : "+object.getProductName());
			System.out.println(" Price : "+object.getProductPrice());
			System.out.println(" Category : "+object.getCategoryCode());
		}
	}