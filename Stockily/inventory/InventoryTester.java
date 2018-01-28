package pmj.ood.inventory;

public class InventoryTester {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        
        InventoryItem x;
        
        x = new InventoryItem(101, "USB Mouse", 5, 10, 450 ); 
        inventory.addNewInventoryItem(x);

        x = new InventoryItem(102, "DVD Drive", 5, 5, 2100 ); 
        inventory.addNewInventoryItem(x);
        
        x = new InventoryItem(103, "Hard Disk", 0, 2, 3500 ); 
        inventory.addNewInventoryItem(x);
        
        try {
        
            inventory.addStock(103, 1);
            inventory.withdrawStock(102, 3);
        
        }
        catch(Exception e) {
            
        }
        
        InventoryItem[] ius = inventory.itemsUnderStock();
        
        for ( InventoryItem i : ius )
            System.out.println(i.getItemCode()+","+i.getItemDescription());     
        
    }
    
}
