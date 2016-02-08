package Items;
import java.io.File;  
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;  
import java.io.FileInputStream;  

public interface readCart {
	public static ArrayList<item> read(String path){
		ArrayList<item> ItemList = new ArrayList<item>();
		try {
			File filename = new File(path);
			InputStreamReader reader = new InputStreamReader(
				new FileInputStream(filename));
			BufferedReader in = new BufferedReader(reader);
			String line = ""; 
			line = in.readLine();  
			while (line != null) {  
                
                String[] parts = line.split(" ");
                float price = Float.parseFloat(parts[parts.length-1]);
                int quantity = Integer.parseInt(parts[0]);
                String[] description = Arrays.copyOfRange(parts, 1, parts.length-2); 
                String itemDescription = String.join(" ", description);
                Boolean isimported;
                if(itemDescription.contains("imported")) {
                	isimported = true;
                }
                else {
                	isimported = false;
                }
				ItemList.add(new item(price, itemDescription, isimported, quantity));
				line = in.readLine(); 
            }  
			in.close();
		} catch (Exception e) {  
	        e.printStackTrace(); 
		}
		return ItemList;
	}
}
