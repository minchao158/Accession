package companyAcception;

public class Student implements Accept {
	int transport=20;//����
	int eat=30;//��ʳ��
	int live=50;//ס�޷�
	int day=2;//�Ӵ�����
	int pay;//����
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("ÿ�챨����ʳ��10Ԫ");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("ס���磬");
	System.out.println("ÿ�챨��ס�޷�20Ԫ");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨������20Ԫ");
	}
	public void print()
	{
		System.out.println("ѧ��(�ɽӴ�����)��");
		eat();
		transport();
		live();
		System.out.println("�ܷ���Ϊ��"+pay()+"\n");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	
}
