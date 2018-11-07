package SpeciesShift;

public class Cucumber extends Shift {

	public Cucumber(Species species) {
		super(species);
		description="ª∆πœ";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return species.getDescription()+"±‰…Ì"+this.description;
	}
}
