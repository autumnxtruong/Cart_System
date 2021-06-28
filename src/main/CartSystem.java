package main;

import java.text.DecimalFormat;
import java.util.HashMap;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
        HashMap<String, Item> hm = getItemCollection();
        Double sumSubTot = 0.0;
        DecimalFormat deciFormat = new DecimalFormat("#0.00");
        System.out.println("Cart:");
        System.out.println(String.format("%-20s", "Name") + " " + String.format("%-20s", "Description") + " "
                + String.format("%-10s", "Price") + " " + String.format("%-10s", "Quantity") + " "
                + String.format("%-10s", "Sub Total"));
        for (String name : hm.keySet()) {
            Item item = hm.get(name);
            String itemName = item.getItemName();
            itemName = String.format("%-20s", itemName);
            String itemDesc = item.getItemDesc();
            itemDesc = String.format("%-20s", itemDesc);
            String itemPrice = deciFormat.format(item.getItemPrice());
            itemPrice = String.format("%-10s", itemPrice);
            String itemQuantity = item.getQuantity().toString();
            itemQuantity = String.format("%-10s", itemQuantity);
            Double itemTotal = item.getQuantity() * item.getItemPrice();
            String formatTotal = String.format("%-10s", deciFormat.format(itemTotal));
            System.out.println(itemName + " " + itemDesc + " " + itemPrice + " " + itemQuantity + " "
                    + formatTotal);
            sumSubTot = sumSubTot + itemTotal;
        }

        Double tax = sumSubTot * 0.05;
        Double total = tax + sumSubTot;

        System.out.print(String.format("%-20s", "Pre-tax Total"));
        System.out.println(" " + String.format("%-20s", deciFormat.format(sumSubTot)));
        System.out.print(String.format("%-20s", "Tax"));
        System.out.println(String.format(" " + "%-20s", deciFormat.format(tax)));
        System.out.print(String.format("%-20s", "Total"));
        System.out.println(String.format(" " + "%-20s", deciFormat.format(total)));
    }
}