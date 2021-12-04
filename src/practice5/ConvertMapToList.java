package practice5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {
	
	public static void main(String[]args) {
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Honda", 2021);
		map1.put("Toyota", 2018);
		map1.put("Porche", 2020);
		map1.put("Ferrari", 2017);
		map1.put("Mersedes", 2013);
		
		System.out.println(map1); // {Ferrari=2017, Toyota=2018, Porche=2020, Mersedes=2013, Honda=2021}
		
		// Print all the keys o the console
		// Way 1
		Set<String> keys = map1.keySet();
		System.out.println(keys); // [Ferrari, Toyota, Porche, Mersedes, Honda]
		
		// Way2
		List<String> key2 = new ArrayList<>(map1.keySet());
		System.out.println(key2); // [Ferrari, Toyota, Porche, Mersedes, Honda]
		
		// Print all the values on the console
		// Way 1
		Collection<Integer> values1 = map1.values();
		System.out.println(values1); // [2017, 2018, 2020, 2013, 2021]
		
		// Way 2
		List<Integer> values2 = new ArrayList<>(map1.values());
		System.out.println(values2);  // [2017, 2018, 2020, 2013, 2021]
		
		//Print all the entries on the console in different lines
        List<Entry<String,Integer>> entries = new ArrayList<>(map1.entrySet());
        System.out.println(entries); // [Ferrari=2017, Toyota=2018, Porche=2020, Mersedes=2013, Honda=2021]
        
        for(Entry<String,Integer> w : entries) {
            System.out.println(w);
        }
		
		
		
		
		
	}
	
	

}
