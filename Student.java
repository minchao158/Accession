package companyAcception;

public class Student implements Accept {
	int transport=20;//车费
	int eat=30;//饮食费
	int live=50;//住宿费
	int day=2;//接待天数
	int pay;//开销
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("每天报销饮食费10元");
	}
	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.print("住旅社，");
	System.out.println("每天报销住宿费20元");
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("每天报销车费20元");
	}
	public void print()
	{
		System.out.println("学生(可接待两天)：");
		eat();
		transport();
		live();
		System.out.println("总费用为："+pay()+"\n");
	}
	public int pay()
	{
		int sum=(eat+transport+live)*day;
		return sum;
	}
	
}
