package SpeciesShift;

/**
 * ����ձ����Ӭ
 * 
 * @author Administrator
 *
 */
public class Flies extends Shift {

	public Flies(Species species) {
		super(species);
		description="��Ӭ";
	}
	@Override
		public String getDescription() {
			return species.getDescription()+"����"+this.description;
		}

}
