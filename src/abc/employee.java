package abc;

public class employee {

	private int id;
	private String name;
	private String joining_date;
	private int salary; 
	private String ssn;
	
	public employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public void setSsn(String ssn){
		this.ssn = ssn; 
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", joining_date=" + joining_date + ", salary=" + salary
				+ ", ssn=" + ssn + "]";
	}
	
	
	
}
