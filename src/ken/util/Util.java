package ken.util;

import java.util.ArrayList;
import java.util.Scanner;

import ken.dao.Student;

public class Util {
	public static boolean addStudent(ArrayList<Student> arrayList){
		 boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入你想插入学生的学号");
		String number=sc.nextLine();
		
		
		System.out.println("请输入你想插入学生的姓名");
	/*	Scanner sc1=new Scanner(System.in);*/
		String name=sc.nextLine();
		
		System.out.println("请输入你想插入学生的城市");
		//Scanner sc2=new Scanner(System.in);
		String city=sc.nextLine();
		
		System.out.println("请输入你想插入学生的年龄");
		int age=sc.nextInt();
		
		arrayList.add(new Student(age,name,number,city));
		flag=true;
		return flag;
		
	
	}

}
