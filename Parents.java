package companyAcception;

public class Parents implements Accept {
	int transport=30;//车费
	int eat=50;//饮食费
	int live=60;//住宿费
	int day=2;//接待天数
	int pay;//开销
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("每天报销饮食费20元");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("住宾馆,");
	System.out.println("每天报销住宿费30元");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("每天报销车费30元");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	@Override
	public void print()
	{
		System.out.println("家长(可接待两天)：");
		eat();
		transport();
		live();
		System.out.println("总费用为："+pay()+"\n");
	}
}
