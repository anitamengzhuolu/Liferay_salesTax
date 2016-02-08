package Items;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.BufferedWriter; 
import java.io.File; 

public interface receiptPrinter {
	public static void write(ArrayList<item> ItemList, float TotalTax){
		float Final_total = 0;
		try {
			DecimalFormat formatter = new DecimalFormat("0.00");
			File writename = new File("Receipt.txt");
			writename.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
			for (item i : ItemList) {
				int Quantity = i.getQuantity();
				String Name = i.getName();
				String TotalPrice = formatter.format(i.getTotalPrice());
				Final_total += i.getTotalPrice();
				String s = String.format("%d %s: %s\r",Quantity, Name, TotalPrice);
				out.write(s);
			}
			String Tax = formatter.format(TotalTax);
			String s_tax = String.format("Sales Taxes: %s\r",Tax);
			String Final = formatter.format(Final_total);
			String s_final = String.format("Total: %s\r",Final);
			out.write(s_tax);
			out.write(s_final);
			out.flush();
			out.close();
		} catch (Exception e) {  
            e.printStackTrace();
		}
	}
}
