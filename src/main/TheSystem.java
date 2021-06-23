package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	
	protected HashMap<String,Item> itemCollection;

    TheSystem() {
    	this.itemCollection  = new HashMap<String,Item>();
    	if(getClass().getSimpleName().equals("AppSystem")) {
    		
    	}
    	
    	
    }
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here
    	return itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {
        // Your code here
    }
    
    public Boolean add(Item item) {
        // Your code here
    }

    public Item remove(String itemName) {
        // Your code here
    }

    public abstract void display();
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here
    }
    
    public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}
}
