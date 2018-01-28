package inventory;

public class InventoryItem {
	int item_code;
	String item_description;
	double cost;
	int qty_in_stock, min_required_stock;
	public InventoryItem (int itm_code, String itm_description, int qty, int min_qty, double cost)
	{  
		this.item_code=itm_code;
		this.item_description=itm_description;
		this.qty_in_stock= qty;
		this.min_required_stock= min_qty;
		this.cost= cost;
	}
	public InventoryItem (int code,String description,double cost )
	{   //sets qty and min_qty to zero }
		this.item_code=code;
		this.item_description=description;
		this.qty_in_stock=0;
		this.min_required_stock= 0;
		this.cost= cost;
	}
	public int getStock(){
		return this.getStock();
	} 
	public double getCost(){
		return this.cost;
	} 
	public int getQty(){
		return this.qty_in_stock;
	} 
	public void addStock(int qty)
	{   //increases the stock by given amount
		this.qty_in_stock+=qty;
		}
	public Boolean isUnderStock()
	{ 
		if (this.qty_in_stock<this.min_required_stock)
			return true;
		else
			return false;
	} 
	public void withdrawStock(int qty) throws InSufficientStock {   //decreases the stock by given amount
		if (this.qty_in_stock>=qty)
		{
			this.qty_in_stock-=qty;
		}
		throw new InSufficientStock();
			
		}
	int getCode()
	{
		return this.item_code;
	
	}
}
