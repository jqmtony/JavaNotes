package SpeciesShift;

/**
 * 所有物种都可以继承Species，抽象类
 * 
 * @author Administrator
 *
 */
public abstract class Species {
	// 声明物种的名称
	protected String description;
	
	// 需要输出物种的名称
	public String getDescription() {
		return description;
	}

}
