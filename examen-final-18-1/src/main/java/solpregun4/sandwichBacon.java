package solpregun4;

import pregunta4.Sandwich;

public abstract class sandwichBacon implements Sandwich {
protected Sandwich SandwichBacon;
	
	
	public SandwichBacon(Sandwich SandwichBacon ) {
	 this.SandwichBacon = SandwichBacon;
			
	}
	@Override
	public String make() {
        return SandwichBacon.make();
}
