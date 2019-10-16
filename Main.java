package pack1;

public class Main {

	public static void main(String[] args) {
		
		Student obj=new Student(1,"ram",22,"pragim");
		System.out.println(obj.getid()+"--"+obj.getname()+"---"+obj.getbatch()+"--"+obj.getinstitute());
		
		Employee obj1=new Employee(100,"suresh",10000,"adobe");
		System.out.println(obj1.getid()+"---"+obj1.getname()+"---"+obj1.getsalary()+"---"+obj1.getOfficename());
				
		
		

	}

}
