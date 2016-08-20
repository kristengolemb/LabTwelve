//ABSTRACT METHODS HAVE NO BODY
//THEY CANNOT BE PRIVATE

public abstract class Player {
	
	private String name;
	private Roshambo roshambo;

	public String getName() {
		return name;
	}
	
	public Roshambo getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(Roshambo choice) {
		this.roshambo = choice;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public Roshambo generateRoshambo ();

	}
