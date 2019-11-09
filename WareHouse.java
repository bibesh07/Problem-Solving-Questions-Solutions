import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
public class WareHouseProblem {

static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	int numOfTestCases = sc.nextInt();
	Hashtable<String, Item> toysWithNameAndQuantity  = new Hashtable<String, Item>();
	for(int i = 0; i<numOfTestCases; i++) {
		fillHashTable(toysWithNameAndQuantity);
	}
}

public static void fillHashTable(Hashtable<String, Item> table){
	int noOfItems = sc.nextInt();
	sc.nextLine();
	for(int i =0; i<noOfItems; i++) {
		String keyVal = sc.nextLine();
		String[] keyValPair = keyVal.split(" ");
		
		Item itemToAdd = new Item(keyValPair[0], Integer.parseInt(keyValPair[1]));
		
		if(table.containsKey(keyValPair[0])) {
			Item duplicatedObject = table.get(keyValPair[0]);
			table.put(keyValPair[0], new Item(keyValPair[0], Integer.parseInt(keyValPair[1]) + duplicatedObject.Quantity));
		}
		else {
			table.put(keyValPair[0], itemToAdd );
		}
	}

	List<Item> itemList = new ArrayList<>(table.values());
	Collections.sort(itemList, Comparator.comparing(Item::GetQuantity).reversed().thenComparing(Item::GetName));
	System.out.println(table.size());
	for (Item i : itemList) {
	   System.out.println(i.Name + " " + i.Quantity);
	}
	table.clear();
	}
}

class Item {
	public String Name;
	public int Quantity;
	
	public Item(String Name, int Quantity) {
		this.Name = Name;
		this.Quantity = Quantity;
	}
	
	public String GetName() {
		return this.Name;
	}
	
	public int GetQuantity() {
		return this.Quantity;
	}
}
