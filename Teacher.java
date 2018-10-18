package companyAcception;

public class Teacher implements Accept {
	int transport=40;//车费
	int eat=60;//饮食费
	int live=80;//住宿费
	int day=3;//接待天数
	int pay;//开销
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("每天报销饮食费30元");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("住酒店，");
		System.out.println("每天报销住宿费40元");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("每天报销车费40元");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	public void print()
	{
		System.out.println("老师(可接待三天)：");
		eat();
		transport();
		live();
		System.out.println("总费用为："+pay()+"\n");
	}
}
