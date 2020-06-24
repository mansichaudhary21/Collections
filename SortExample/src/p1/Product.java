package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId, String productName, double productPrice)
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() 
	{
	    return "[ productId=" + productId + ", name=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	 	
	public static void main(String[] args)
	{
		Product p1 = new Product(1,"Laptop",35000.0);
		Product p2 = new Product(2,"Mobile",25000.0);
		Product p3 = new Product(3,"Refrigerator",20000.0);
		Product p4 = new Product(4,"Microwave",30000.0);
		
		List<Product> obj_List = new ArrayList<>();
		obj_List.add(p1);
		obj_List.add(p2);
		obj_List.add(p3);
		obj_List.add(p4);
		
		Stream<Product> obj_Stream = obj_List.stream();
		
		List<Product> result = obj_Stream.sorted((prod1,prod2)-> prod1.productName.compareTo(prod2.productName))
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		//Collections.sort(obj_List);
		
		
		/*Comparator<Product> productNameComparator = new Comparator<Product>()
		{
			@Override
			public int compare(Product p1, Product p2) 
			{
				//char prod1 = p1.productName.charAt(0);
				//char prod2 = p2.productName.charAt(0);
			   //ascending order
			    //if(prod1>prod2)
				  // return 1;
			    //else
				  // return -1;
			}
		};

		
		Collections.sort(obj_List,productNameComparator);
		
		//Print the list of products
		for (Product product : obj_List) {
			System.out.println(product);
		}*/
	}
	
	
}
