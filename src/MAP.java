import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAP {
public static void main(String[] args) {
	Map map =new HashMap();
	 map.put("a","ôô");
	 map.put("b","ôô1");
	 map.put("c","ôô2");
	 System.out.println(map.size());
	Set KetSet= map.keySet();
	for (Object object : KetSet) {
		System.out.println(object+"---"+map.get(object));
	}
	System.out.println("----------------------");
	 Iterator it = KetSet.iterator();
	 while(it.hasNext()){
		 Object key=it.next();
		 System.out.println(key+"====="+map.get(key));
	 }
}
}
