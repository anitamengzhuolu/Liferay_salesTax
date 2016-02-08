package Items;
import java.math.BigDecimal;

import Tax_calculator.ImportedTax;
import Tax_calculator.LocalTax;

public class item {
	public float Price;
	public String Name;
	Boolean isImported;
	int Quantity;
	float Tax;
	float TotalPrice;
	
	public item(float original_price, String item_name, Boolean isimported, int quantity) {
		
		this.Price = original_price * quantity;
		this.Name = item_name;
		this.isImported = isimported;
		this.Quantity = quantity;
		this.Tax = TaxCalc();
		this.TotalPrice = this.Tax + this.Price;
	}
	
	public float getTotalPrice() {
		return TotalPrice;
	}
	
	public float getTax() {
		return Tax;
	}
		
	public float getPrice() {
		return Price;
	}
		
	public String getName() {
		return Name;
	}
	
	public Boolean getisImported() {
		return isImported;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	
	private float TaxCalc() {
		float InitialTax;
		if (isImported) {
			InitialTax = LocalTax.calc(this) + ImportedTax.calc(this);
		}
		else {
			InitialTax = LocalTax.calc(this);
		}
		float Tax_f = (float) (Math.ceil(InitialTax * 20.0) / 20.0);
		BigDecimal Tax_b = new BigDecimal(Tax_f); 
		return Tax_b.floatValue();
	}
}