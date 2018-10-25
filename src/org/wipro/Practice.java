package org.wipro;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {
public static void main(String[] args) {
	Map<Integer, String> emp = new HashMap<>();
	emp.put(10, "Dinesh");
	emp.put(40, "Geetha");
	emp.put(30, "Asmitha");
	emp.put(20, "Jean");
	System.out.println(emp);
	boolean c = emp.containsKey(30);
	System.out.println(c);
	Set<Integer> d = emp.keySet();
	System.out.println(d);
	Collection<String> g = emp.values();
   System.out.println(g);
   Set<Entry<Integer, String>> s = emp.entrySet();
   for (Entry<Integer, String> e : s) {
	   System.out.println(e.getKey());
	System.out.println(e.getValue());
}
	
}
}


