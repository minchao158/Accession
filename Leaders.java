package companyAcception;

public class Leaders implements Accept, Gift {
	int transport=100;//����
	int eat=150;//��ʳ��
	int live=200;//ס�޷�
	int gift=300;//�����
	int day=7;//�Ӵ�����
	int pay;//����
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨����ʳ��100Ԫ");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("ס���Ǽ��Ƶ꣬");
		System.out.println("ÿ�챨��ס�޷�200Ԫ");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("ÿ�챨������100Ԫ");
	}
	public void gift()
	{
		System.out.println("�쵼������Ϊ300Ԫ");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day+gift;
		return sum;
	}
	public void print()
	{
		System.out.println("�쵼(�ɽӴ�����)��");
		eat();
		transport();
		live();
		gift();
		gift();
		System.out.println("�ܷ���Ϊ��"+pay()+"\n");
	}
}
