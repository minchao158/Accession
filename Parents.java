package companyAcception;

public class Parents implements Accept {
	int transport=30;//����
	int eat=50;//��ʳ��
	int live=60;//ס�޷�
	int day=2;//�Ӵ�����
	int pay;//����
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("ÿ�챨����ʳ��20Ԫ");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("ס����,");
	System.out.println("ÿ�챨��ס�޷�30Ԫ");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨������30Ԫ");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	@Override
	public void print()
	{
		System.out.println("�ҳ�(�ɽӴ�����)��");
		eat();
		transport();
		live();
		System.out.println("�ܷ���Ϊ��"+pay()+"\n");
	}
}
