package SpeciesShift;

/**
 * ����ձ���С����
 * 
 * @author Administrator
 *
 */
public class Rabbit extends Shift {
	// ��ʲô���ַŵ�rabbit���棬������־�ӵ���˱���������ֵ�����
	public Rabbit(Species species) {
		super(species);
		description = "С����";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return species.getDescription() + "����" + this.description;
	}
}
