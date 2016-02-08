package Items;
import java.util.ArrayList;

public class main {
	public static void main(String[] args){
		String File = "";
		if (args.length == 0){
			File = "Test1.txt";
		}
		else {
			File = args[0];
		}
		ArrayList<item> ItemList = readCart.read(File);
		float TotalTax = 0;
		for (item i : ItemList) {
			TotalTax += i.getTax();
		}
		receiptPrinter.write(ItemList, TotalTax);
	}
	

}
