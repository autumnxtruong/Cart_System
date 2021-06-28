package main;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer availableQuantity;
    private Integer quantity;
    
    
    public Item() {
        // Your code here
    	this.quantity = 1; //R1
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        // Your code here
    	
    	this.itemName = itemName;
    	this.itemDesc = itemDesc;
    	this.availableQuantity = availableQuantity;   	
    }

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
    
    
    
    
}
