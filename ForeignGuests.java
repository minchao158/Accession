package companyAcception;

public class ForeignGuests implements Accept, Gift {
	int transport=80;//车费
	int eat=100;//饮食费
	int live=150;//住宿费
	int gift=200;//礼物费
	int day=5;//接待天数
	int pay;//开销
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("每天报销饮食费80元");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("住三星级酒店，");
		System.out.println("每天报销住宿费100元");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("每天报销车费60");
	}
	public void gift()
	{
		System.out.println("外宾的礼物为200元");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day+gift;
		return sum;
	}
	public void print()
	{
		System.out.println("外宾(可接待五天)：");
		eat();
		transport();
		live();
		gift();
		System.out.println("总费用为："+pay()+"\n");
	}
}
