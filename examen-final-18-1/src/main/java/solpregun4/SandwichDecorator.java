package solpregun4;

public abstract class SandwichDecorator implements Sandwich {
	protected Sandwich decoratedsandwich;
	
	
	public SandwichDecorator(Sandwich decoratedsandwich ) {
	 this.decoratedsandwich = decoratedsandwich;
			
	}
	@Override
	public String make() {
        return decoratedsandwich.make();
}
	
	
}
