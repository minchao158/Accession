package companyAcception;

public class Teacher implements Accept {
	int transport=40;//����
	int eat=60;//��ʳ��
	int live=80;//ס�޷�
	int day=3;//�Ӵ�����
	int pay;//����
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨����ʳ��30Ԫ");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("ס�Ƶ꣬");
		System.out.println("ÿ�챨��ס�޷�40Ԫ");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨������40Ԫ");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	public void print()
	{
		System.out.println("��ʦ(�ɽӴ�����)��");
		eat();
		transport();
		live();
		System.out.println("�ܷ���Ϊ��"+pay()+"\n");
	}
}
