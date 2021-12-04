package familyproject;

import java.util.*;

public class Runner {

	public static void main(String[] args) {
		Father father = new Father();// different object
		father.setName("Murat");
		father.setLastname("Nguyen");
		Product product = new Product();
		product.setName("camera");
		Product product2 = new Product();
		product2.setName("phone");
		List<Product> itemsToBuy = new ArrayList<>();// This is a list of products we want to buy
		itemsToBuy.add(product);
		itemsToBuy.add(product2);
		Requirement req = new Requirement(itemsToBuy);
		
		father.setRequirement(req);//camera and phone
		//if we go shopping center / the list is in the requirement
		//
		
		List <Product> boughtItems = shoppingCenter(father);
		father.setList(boughtItems);
		Son son = new Son();// different object
		son.setName("Usame");
		son.setLastname("Nguyen");
		
		
		Product sonProduct = new Product();
		sonProduct.setName("pen");
		
		Product sonProduct2 = new Product();
		sonProduct2.setName("mathbook");
		
		List<Product> sonList = new ArrayList<>();
		sonList.add(sonProduct);
		sonList.add(sonProduct2);
		
		Requirement sonRequirement = new Requirement(sonList);
		
		son.setRequirement(sonRequirement);//This sets the planned items of Son
		
		
		
		System.out.println(father);
		
		
		
		
		System.out.println("Father's budget: "+father.getBudget());
		
		
		
		List<Product> sonPList = shoppingCenter(son);
		
		son.setList(sonPList);
		
		System.out.println(son);
		
		System.out.println(father.getBudget());
		
		
	}
	
	
	public static List<Product> shoppingCenter(Father father ){
		
		
		
		List<Product> boughtItems = new ArrayList<>();
		
		String items = "camera, phone, TV, cucumber, tomatos, meat, shovel, iceberg, pen, pencil, mathbook";
		String prices = "500, 1500, 600, 3, 5, 10, 20, 3, 1, 1, 25";
		
		String [] itemsArray = items.split(",");
		String [] priceArray = prices.split(",");
		
		List<Product> currentList = father.getRequirement().getList();
	
		for(Product each : currentList) {
			
			
			
			//Conditions: check the price / budget  //check the item if it exists
			
			for(int i=0 ; i < itemsArray.length; i++) {
				
				//We check if the item exists
				if(each.getName().contains(itemsArray[i].trim())) {
					
					//4500   > 1500
					//double price String double
					//we are checking if our budget is enough to buy the item
					if(father.getBudget() > Double.parseDouble(priceArray[i].trim()) ) {
						
						Product product = new Product();
						product.setName(itemsArray[i].trim());
						//double        String
						product.setPrice(Double.parseDouble(priceArray[i].trim()));
						
						boughtItems.add(product);
						
						father.buyProduct(product.getPrice());
						break;
						
						
					}else {
						System.out.println("Hey! Sorry, but your budget is not sufficient!");
					}
					
					
				}
				
			}
			
		}
		
		
		
		return boughtItems;
	
	}
	
	
	
	public static List<Product> shoppingCenter(Son son){
		
		
		
		List<Product> boughtItems = new ArrayList<>();
		
		String items = "camera, phone, TV, cucumber, tomatos, meat, shovel, iceberg, pen, pencil, mathbook";
		String prices = "500, 1500, 600, 3, 5, 10, 20, 3, 1, 1, 25";
		
		String [] itemsArray = items.split(",");
		String [] priceArray = prices.split(",");
		
		List<Product> currentList = son.getRequirement().getList();
	
		for(Product each : currentList) {
			
			//pen / mathbook
			
			//Conditions: check the price / budget  //check the item if it exists
			
			for(int i=0 ; i < itemsArray.length; i++) {
				
				//We check if the item exists // index8
				if(each.getName().contains(itemsArray[i].trim())) {
					
					//4500   > 1500
					//double price String double
					//we are checking if our budget is enough to buy the item
					if(son.getBudget() > Double.parseDouble(priceArray[i].trim()) ) {
						
						Product product = new Product();
						product.setName(itemsArray[i].trim());
						//double        String
						product.setPrice(Double.parseDouble(priceArray[i].trim()));
						
						boughtItems.add(product);
						
						son.buyProduct(product.getPrice());
						break;
						
						
					}else {
						System.out.println("Hey! Sorry, but your budget is not sufficient!");
					}
					
					
				}
				
			}
			
		}
		
		
		
		return boughtItems;
	
	}
	
	
}