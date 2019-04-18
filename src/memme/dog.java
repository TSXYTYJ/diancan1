package memme;
import java.util.TreeSet;

public class dog  implements Comparable<dog>{
	String name;
	String stain;
	int age;
	public dog() {
		super();
	}
	public dog(String name, String stain, int age) {
		super();
		this.name = name;
		this.stain = stain;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStain() {
		return stain;
	}
	public void setStain(String stain) {
		this.stain = stain;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"\t"+this.age+"\t"+this.stain;
	}
	@Override
	public int compareTo(dog o) {
		if(this.age>o.getAge()){
			return 1;
		}else if(this.age<o.getAge()){
		return -1;
	}
		return 0;
}
}
