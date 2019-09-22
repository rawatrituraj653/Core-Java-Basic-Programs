import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		Integer k = new Integer(20);
		HashSet hs = new HashSet();
		hs.add(i);
		hs.add(j);
		hs.add(k);
		System.out.println(hs);
		
		HashSet hs1 = new HashSet();
		hs1.add("Aa");
		hs1.add("BB");
		System.out.println(hs1);
		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
		
	}
}
