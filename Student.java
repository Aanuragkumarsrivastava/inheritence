package pack1;

public class Student extends Person{

	private int batch;
	private String institute;
	public Student(int id, String name, int batch, String institute) {
		super(id, name);
		this.batch = batch;
		this.institute = institute;
	}
	
	public int getbatch()
	{
		return batch;
	}
	public String getinstitute()
	{
		return institute;
	}
}
