
//Declaring Class as Abstract
public abstract class Animal {
	private String name;
	
	public Animal(String name){
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//Declaring Abstract Methods
	public abstract void eat();
	public abstract void breathe();
}
