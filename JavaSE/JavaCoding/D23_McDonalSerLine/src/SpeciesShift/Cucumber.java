package SpeciesShift;

public class Cucumber extends Shift {

	public Cucumber(Species species) {
		super(species);
		description="�ƹ�";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return species.getDescription()+"����"+this.description;
	}
}
