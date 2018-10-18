package companyAcception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("接待的访客类型有：\n"+"1.学生 2.家长 3.老师"+"贵宾有：\n"+"4.外宾 5.领导");
		System.out.println("请输入要查看的类型，若查看所有请选择0\n"+"退出选择6");
		int flag=1;
		do
		{
		try{
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			Student st=new Student();
			Parents pr=new Parents();
			Teacher tc=new Teacher();
			ForeignGuests fg=new ForeignGuests();
			Leaders ld=new Leaders();
			switch(i)
			{
			case 0:						//所有类型
				st.print();
				pr.print();
				tc.print();
				fg.print();
				ld.print();
				break;
			case 1:					//学生
				st.print();
				break;
			case 2:					//家长
				pr.print();
				break;
			case 3:					//老师
				tc.print();	
				break;
			case 4:					//外宾
				fg.print();
				break;
			case 5:					//领导
				ld.print();
				break;
			case 6:					//退出
				flag=0;
				System.out.println("已成功退出！");
				break;
			default:
				System.out.println("请输入0~6的整数！");
				break;
			}
		}catch(InputMismatchException e)
		{
//			e.printStackTrace();
			System.out.println("请输入整数!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}while(flag==1);
	}

}
