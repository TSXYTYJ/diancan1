

	public class Worker implements Comparable<Worker>{
		private int age;
		private String name;
		private double salary;
		public Worker (){}
		public Worker (String name, int age, double salary){
			this.name = name; 
			this.age = age;
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary(){
			return salary;
		}
		public void setSalary(double salary){
			this.salary = salary;
		}
		public void work(){
			System.out.println(name + "work");
		}
		@Override
		public String toString() {
			
			return this.name+"\t"+this.age+"\t"+this.salary;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		@Override
		public int compareTo(Worker o) {
			if(this.salary>o.getSalary()){
				return 1;  
			}	else if(this.salary<o.getSalary()){
				return -1;
			}
			
			return 0;
		}
	} 

