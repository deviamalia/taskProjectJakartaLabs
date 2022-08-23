package mytasks.java;

import java.util.TreeMap;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap< String, String > tree_map = new TreeMap <>();

		tree_map.put("baca buku", "Amalia" );
		tree_map.put("hias tanaman", "Arini");
		tree_map.put("bersepeda", "Devi");
		
		System.out.println(tree_map);
		
		
		TreeSet < String> tree_set = new TreeSet <>();
		tree_set.add("V");
		tree_set.add("I");
		tree_set.add("D");
		tree_set.add("E");
		tree_set.add("D");


		System.out.println(tree_set);
		
		
	}
	
	

}
