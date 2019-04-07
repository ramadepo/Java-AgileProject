package main;

import java.io.*;
import java.util.Scanner;


public class GradeSystems {
	public GradeSystems(String file) {
		
	}
	public boolean containID(String ID) {
		//temp
		if(ID != "") {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean showGrade(String ID) {
		//temp
		if(ID == "962001044") {
			System.out.print("凌宗廷成績：lab1：    " + "87" + "\n" +
									"\t  lab2：    " + "86" + "\n" +
									"\t  lab3：    " + "98" + "\n" +
									"\t  midterm exam：    " + "88" + "\n" +
									"\t  final exam：    " + "87" + "\n" +
									"    totoal grade：    " + "88\n");
		}
		else if(ID == "962001051") {
			System.out.print("李威廷成績：lab1：    " + "81" + "\n" +
									"\t  lab2：    " + "98" + "\n" +
									"\t  lab3：    " + "84" + "\n" +
									"\t  midterm exam：    " + "90" + "\n" +
									"\t  final exam：    " + "93" + "\n" +
									"    totoal grade：    " + "91\n");
		}
		return true;
	}
	public boolean showRank(String ID) {
		//temp
		if(ID == "962001044") {
			System.out.print("凌宗廷排名第2\n");
		}
		else if(ID == "962001051") {
			System.out.print("李威廷排名第1\n");
		}
		return true;
	}
	public boolean updateWeights() {
		Scanner scan = new Scanner(System.in);
		int lab1, lab2, lab3, mid, fin;
		
		System.out.print("舊配分" + "\n" + 
							"lab1\t10%" + "\n" +
							"lab2\t10%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t30%" + "\n" +
							"final exam\t40%" + "\n" +
							"輸入新配分\n");
		System.out.print("lab1\t");
		lab1 = scan.nextInt();
		System.out.print("lab2\t");
		lab2 = scan.nextInt();
		System.out.print("lab3\t");
		lab3 = scan.nextInt();
		System.out.print("midterm exam\t");
		mid = scan.nextInt();
		System.out.print("final exam\t");
		fin = scan.nextInt();
		System.out.print("請確認新配分" + "\n" + 
							"lab1\t" + Integer.toString(lab1) + "%" + "\n" +
							"lab2\t" + Integer.toString(lab2) + "%" + "\n" + 
							"lab3\t" + Integer.toString(lab3) + "%" + "\n" + 
							"midterm exam\t" + Integer.toString(mid) + "%" + "\n" + 
							"final exam\t" + Integer.toString(fin) + "%" + "\n" + 
							"以上正確嗎? Y (Yes) 或 N (No)\t");
		if(scan.nextLine().equals("Y")) {
			//temp : update the weight or return weight
			return true;
		}
		else {
			//temp : cancel weight updating
			return false;
		}
	}
}
