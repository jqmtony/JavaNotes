package SpeciesShift;

/**
 * 孙悟空变身小白兔
 * 
 * @author Administrator
 *
 */
public class Rabbit extends Shift {
	// 把什么物种放到rabbit里面，这个物种就拥有了变身这个物种的能力
	public Rabbit(Species species) {
		super(species);
		description = "小白兔";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return species.getDescription() + "变身" + this.description;
	}
}
