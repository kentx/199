package ken.util;

import java.util.ArrayList;
import java.util.Scanner;

import ken.dao.Student;

public class Util {
	public static boolean addStudent(ArrayList<Student> arrayList){
		 boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�������������ѧ����ѧ��");
		String number=sc.nextLine();
		
		
		System.out.println("�������������ѧ��������");
	/*	Scanner sc1=new Scanner(System.in);*/
		String name=sc.nextLine();
		
		System.out.println("�������������ѧ���ĳ���");
		//Scanner sc2=new Scanner(System.in);
		String city=sc.nextLine();
		
		System.out.println("�������������ѧ��������");
		int age=sc.nextInt();
		
		arrayList.add(new Student(age,name,number,city));
		flag=true;
		return flag;
		
	
	}

}
