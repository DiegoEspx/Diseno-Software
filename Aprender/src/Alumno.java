package 
public class Alumno {
	//attributes
	public int id;
	public String name;
	public String lastName;
	
	//yes
	public Alumno(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	//getters and setters
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//methods
	public void printInformation(){
		System.out.println("La id es: "+id);
		System.out.println("el nombre es: "+name);
		System.out.println("el apellido es: "+lastName);
	}
	
	

}
