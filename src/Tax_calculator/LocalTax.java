package Tax_calculator;
import Items.item;

public interface LocalTax {
	public static float calc(item Item){
		String Name = Item.Name;
		float Price = Item.Price;
		float Tax = 0;
		if (isBook(Name, book) || isMedicine(Name, medicine) || isFood(Name, food)) {
			Tax = 0;
		}
		else {
			Tax = (float) (Price * 0.1);
		}
		return Tax;
	}
	static String[] food = {"food" ,"chocolate", "chicken", "butter", "egg", "milk", "bread", "pork", "beef", "lamb", "fish"};
	static String[]  medicine= {"medicine", "pill", "panadol", "headache", "stomachache", "throat", "backache"};
	static String[]  book= {"book"};
	
	public static boolean isFood(String inputString, String[] food)
	{
	    for(int i =0; i < food.length; i++)
	    {
	        if(inputString.contains(food[i]))
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean isMedicine(String inputString, String[] medicine)
	{
	    for(int i =0; i < medicine.length; i++)
	    {
	        if(inputString.contains(medicine[i]))
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean isBook(String inputString, String[] book)
	{
	    for(int i =0; i < book.length; i++)
	    {
	        if(inputString.contains(book[i]))
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
}
