package main;

import java.util.Scanner;


public class UI {
	public UI() {
		
	}
	public String promptCommand() {
		Scanner scan = new Scanner(System.in);
		System.out.print("輸入指令\t1) G 顯示成績 (Grade)" + "\n" + 
								"\t2) R 顯示排名 (Rank)" + "\n" + 
								"\t3) W 更新配分 (Weight)" + "\n" + 
								"\t4) E 離開選單 (Exit)\n");
		String command = scan.nextLine();
		
		if(command.length() == 1) {
			return command;
		}
		else {
			// raise No Command Exception
			return "";
		}
	}
	public String promptID() {
		Scanner scan = new Scanner(System.in);
		System.out.print("輸入ID或 Q (結束使用)？\t");
		String ID = scan.nextLine();
		
		if((ID.length() == 1) && (ID.equals("Q"))) {
			return ID;
		}
		else if(ID.length() == 9) {
			return ID;
		}
		else {
			// raise No Command Exception
			return "";
		}
	}
	public boolean showFinishMsg() {
		System.out.print("結束了\n");
		
		return true;
	}
	public boolean showWelcomeMsg(String name) {
		System.out.print("Welcome " + name + "\n");
		
		return true;
	}
}
