package model;

public class Product {

	private int productId;
	private String productName;
	private int minSellQuantity;
	private int price;
	private int quantity;
	
	public int getproductId() {
		return productId;
	}
	public void setproductId(int productId)
	{
		this.productId=productId;
	}
	public String getproductName()
	{
		return productName;
	}
	public void setproductName(String productName)
	{
		this.productName=productName;
	}
	public int getMinSellQuantity() {
		return minSellQuantity;
	}
	public void setMinSellQuantity(int minSellQuantity)
	{
		this.minSellQuantity=minSellQuantity;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuanity(int quantity)
	{
		this.quantity = quantity;
	}
	

}
