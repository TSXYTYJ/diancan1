package set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class java {
	public static void main(String[] args) {
		dog d=new dog("o", "p", 11111);
		dog d1=new dog("o1", "p1", 1111);
		dog d2=new dog("o2", "p2", 111);
		dog d3=new dog("o3", "p3", 11);
	Set set =new TreeSet();
	set.add(d);
	set.add(d1);
	set.add(d2);
	set.add(d3);
	
	
		
		for (Object o : set) {
			System.out.println(o);
		}
			System.out.println("---------------");
			Iterator it = set.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
	}
}
