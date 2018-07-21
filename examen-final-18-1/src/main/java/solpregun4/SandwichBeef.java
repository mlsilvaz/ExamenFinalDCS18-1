package solpregun4;

import pregunta4.Sandwich;

public abstract class SandwichBeef implements Sandwich {
protected Sandwich SandwichBeef;
	
	
	public SandwichBeef(Sandwich SandwichBeef ) {
	 this.SandwichBeef = SandwichBeef;
			
	}
	@Override
	public String make() {
        return SandwichBeef.make();
}
