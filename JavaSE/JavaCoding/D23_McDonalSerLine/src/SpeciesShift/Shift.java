package SpeciesShift;
/**
 * 变身的功能，实际和Species是组合，所以也是抽象类，不写抽象的话就是继承了
 * @author Administrator
 *
 */
public abstract class Shift extends Species{

	protected Species species;

	public Shift(Species species) {
		this.species=species;
	}
	
}
