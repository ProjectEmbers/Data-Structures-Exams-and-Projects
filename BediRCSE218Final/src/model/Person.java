package model;

public class Person 
{
	private String ssn;
	private String name;

	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Person [ssn=" + ssn + ", name=" + name + "]";
	}

}
