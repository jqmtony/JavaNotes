package SpeciesShift;

/**
 * 孙悟空变身苍蝇
 * 
 * @author Administrator
 *
 */
public class Flies extends Shift {

	public Flies(Species species) {
		super(species);
		description="苍蝇";
	}
	@Override
		public String getDescription() {
			return species.getDescription()+"变身"+this.description;
		}

}
