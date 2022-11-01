package oop1;

public class Main {

	public static void main(String[] args) 
	{
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Smg Kahve Makinesi");
		product2.setDiscount(4);
		product2.setImageUrl("bilmemne.jpg");
		product2.setUnitPrice(9500);
		product2.setUnitsInStock(5);
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(6);
		product3.setImageUrl("bilmemne.jpg");
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(1);
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for(Product product : products)
		{
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer induvidualCustomer = new IndividualCustomer();
		induvidualCustomer.setId(1);
		induvidualCustomer.setCustomerNumber("00000000");
		induvidualCustomer.setPhoneNumber("0000001231");
		induvidualCustomer.setFirstName("Batuhan");
		induvidualCustomer.setLastName("Kaynarcalidan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("123123123123");
		corporateCustomer.setPhoneNumber("2223324555");
		corporateCustomer.setCompanyName("FARMEX");
		corporateCustomer.setTaxNumber("02020020202");
	}

}
