package companyAcception;

public class ForeignGuests implements Accept, Gift {
	int transport=80;//����
	int eat=100;//��ʳ��
	int live=150;//ס�޷�
	int gift=200;//�����
	int day=5;//�Ӵ�����
	int pay;//����
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨����ʳ��80Ԫ");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("ס���Ǽ��Ƶ꣬");
		System.out.println("ÿ�챨��ס�޷�100Ԫ");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨������60");
	}
	public void gift()
	{
		System.out.println("���������Ϊ200Ԫ");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day+gift;
		return sum;
	}
	public void print()
	{
		System.out.println("���(�ɽӴ�����)��");
		eat();
		transport();
		live();
		gift();
		System.out.println("�ܷ���Ϊ��"+pay()+"\n");
	}
}
