package solpregun4;

import pregunta4.Sandwich;

public abstract class SandwichEgg implements Sandwich {
protected Sandwich SandwichEgg;
	
	
	public SandwichEgg(Sandwich SandwichEgg ) {
	 this.SandwichEgg = SandwichEgg;
			
	}
	@Override
	public String make() {
        return SandwichEgg.make();
}
