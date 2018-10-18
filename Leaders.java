package companyAcception;

public class Leaders implements Accept, Gift {
	int transport=100;//车费
	int eat=150;//饮食费
	int live=200;//住宿费
	int gift=300;//礼物费
	int day=7;//接待天数
	int pay;//开销
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("每天报销饮食费100元");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("住五星级酒店，");
		System.out.println("每天报销住宿费200元");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("每天报销车费100元");
	}
	public void gift()
	{
		System.out.println("领导的礼物为300元");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day+gift;
		return sum;
	}
	public void print()
	{
		System.out.println("领导(可接待七天)：");
		eat();
		transport();
		live();
		gift();
		gift();
		System.out.println("总费用为："+pay()+"\n");
	}
}
