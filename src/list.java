import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class list {
public static void main(String[] args) {
	Worker a=new Worker("张三", 18, 3000);
	Worker a1=new Worker("李四", 25, 3500);
	Worker a2=new Worker("王五", 18, 3200);
	List list =new LinkedList();
	Set set=new TreeSet();
//	list.add(a);
//	list.add(a1);
//	list.add(a2);
//	list.remove(a2);
	set.add(a);
	set.add(a1);
	set.add(a2);
	set.add(a);
	
	
	for (Object object : set) {
		System.out.println(object);
	}
System.out.println("--------------");
	Iterator it = set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
