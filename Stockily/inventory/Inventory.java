package inventory;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	ArrayList<InventoryItem> Items;
	Inventory(){   
		Items= new ArrayList<>();
	}
	public void addNewInventoryItem(InventoryItem new_item)
	{
		Items.add(new_item);
 } 
	public void addStock(int item_code, int qty) throws ItemNotFound {  
		//adds specified qty of specified item to the inventory 
		//you may have locate the specified item in the collection before increasing its stock 
		Iterator i= Items.iterator();
		while (i.hasNext())
		{
			InventoryItem item=(InventoryItem) i.next(); //doubt
			if (item.getCode()==item_code)
			{
				item.addStock(qty);
				break;
			}
		}
		}
		public void withdrawStock(int item_code,int qty) throws ItemNotFound, InSufficientStock 
		{ 
			Iterator i= Items.iterator();
			while (i.hasNext())
			{
				InventoryItem item= (InventoryItem) i.next();
				if (item.getCode()==item_code)
				{
					item.withdrawStock(qty);
					break
				}
			}
			
		} 
		public InventoryItem[] itemsUnderStock() 
		{
			return null; 
	}
 

	private InventoryItem search(int item_code) throws ItemNotFound { // returns
																		// item
																		// object
																		// with
																		// given
																		// item
																		// code,
																		// if
																		// found
																		 }
																		//
		public double totalInventoryCost(){

	} // Field Declarations //you decide what to be added ..
}