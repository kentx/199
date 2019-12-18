package ken.demo;
import java.util.ArrayList;
import java.util.Scanner;

import ken.dao.*;
import ken.util.Util;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		int count=0;
		while(true){
			count++;
			//Math.random()
			Util.addStudent(arrayList);
			if(count==2){
				break;
			}
			
		}
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i).toString());
		}
		
		
	}
	
	
}
