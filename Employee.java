package pack1;

public class Employee extends Person
{
	private double salary;
	private String Officename;
	public Employee(int id, String name, double salary, String officename) {
		super(id, name);
		this.salary = salary;
		Officename = officename;
	}

	public double getsalary()
	{
		return salary;
	}
	public String getOfficename()
	{
		return Officename;
	}
}
