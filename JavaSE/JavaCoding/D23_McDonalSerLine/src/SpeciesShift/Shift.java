package SpeciesShift;
/**
 * ����Ĺ��ܣ�ʵ�ʺ�Species����ϣ�����Ҳ�ǳ����࣬��д����Ļ����Ǽ̳���
 * @author Administrator
 *
 */
public abstract class Shift extends Species{

	protected Species species;

	public Shift(Species species) {
		this.species=species;
	}
	
}
