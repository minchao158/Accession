package companyAcception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ӵ��ķÿ������У�\n"+"1.ѧ�� 2.�ҳ� 3.��ʦ"+"����У�\n"+"4.��� 5.�쵼");
		System.out.println("������Ҫ�鿴�����ͣ����鿴������ѡ��0\n"+"�˳�ѡ��6");
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
			case 0:						//��������
				st.print();
				pr.print();
				tc.print();
				fg.print();
				ld.print();
				break;
			case 1:					//ѧ��
				st.print();
				break;
			case 2:					//�ҳ�
				pr.print();
				break;
			case 3:					//��ʦ
				tc.print();	
				break;
			case 4:					//���
				fg.print();
				break;
			case 5:					//�쵼
				ld.print();
				break;
			case 6:					//�˳�
				flag=0;
				System.out.println("�ѳɹ��˳���");
				break;
			default:
				System.out.println("������0~6��������");
				break;
			}
		}catch(InputMismatchException e)
		{
//			e.printStackTrace();
			System.out.println("����������!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}while(flag==1);
	}

}
