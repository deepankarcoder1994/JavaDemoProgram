
public abstract class Bird extends Animal implements CanFly {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is pecking");	
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
	}

	@Override
	public void fly() {
	  System.out.println(getName() + " is flapping its wings");
	}
	
	//Making Bird class as Abstract and declaring one more abstract Method fly() to add the flying feature
	//Any flying bird class that extends Bird class has to Override this Method
	/*public abstract void fly();*/	
	
}
