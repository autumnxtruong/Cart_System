package main;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {
        HashMap<String, Item> hMap = getItemCollection();
        DecimalFormat deciFormat = new DecimalFormat("#0.00");
        System.out.println("AppSystem Inventory:");
        System.out.println(String.format("%-20s", "Name") + " " + String.format("%-20s", "Description") + " "
                + String.format("%-10s", "Price") + " " + String.format("%-10s", "Available Quantity"));
        for (String name : hMap.keySet()) {
            Item item = hMap.get(name);
            String itemName = item.getItemName();
            itemName = String.format("%-20s", itemName);
            String itemDesc = item.getItemDesc();
            itemDesc = String.format("%-20s", itemDesc);
            String itemPrice = deciFormat.format(item.getItemPrice());
            itemPrice = String.format("%-10s", itemPrice);
            String availableQuantity = item.getAvailableQuantity().toString();
            availableQuantity = String.format("%-10s", availableQuantity);
            System.out.println(itemName + " " + itemDesc + " " + itemPrice + " " + availableQuantity);
        }
//        AppSystem obj = new AppSystem();
//        Set<Entry<String,Item>> mySet = getItemCollection().entrySet();
//        Iterator itr = mySet.iterator();
//        while(itr.hasNext()) {
//        	Map.Entry<String,Item> x = (Entry<String,Item>) itr.next();
//        	String itemname = x.getValue().getItemName();
//        	itemname = String.format("%-20s", itemname);
//        	
//        }
        
        
    }

    @Override
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        }
        if (getItemCollection().containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the App System");
            return false;
        } else {
            getItemCollection().put(item.getItemName(), item);
            return true;
        }
    }

    public Item reduceAvailableQuantity(String item_name) {
        if (!getItemCollection().containsKey(item_name)) {
            return null;
        } else {
            Item myItem = getItemCollection().get(item_name);
            myItem.setAvailableQuantity(myItem.getAvailableQuantity() - 1);
            if (myItem.getAvailableQuantity() == 0) {
                getItemCollection().remove(item_name);
                return null;
            }
            return myItem;
        }
    }
}