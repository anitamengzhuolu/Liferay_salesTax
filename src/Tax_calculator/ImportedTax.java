package Tax_calculator;
import Items.item;

public interface ImportedTax {
	public static float calc(item Item){
		float Price = Item.Price;
		float Tax = 0;
		Tax = (float) (Price * 0.05);
		return Tax;
	}
}
