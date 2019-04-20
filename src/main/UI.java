///*************************************************************************
//class UI (user interface)  aUI manager the user interface
//
//promptCommand()
//promptID()
//showFinishMsg()
//showWelcomeMsg(name)
//UI() construct aUI
//*************************************************************************/
//public class UI
//	/*----------------------------------------------------------------------------------------------------------
//	UI() constructor
//	----------------------------------------------------------------------------------------------------------*/
//	UI(){}
//
//	/*-------------------------------------------------------------------------------------------------------------
//	promptCommand() ask for command
//	exception: NoSuchCommandExceptions
//	return: inputCommand
//	-------------------------------------------------------------------------------------------------------------*/
//	prompt user for inputCommand
//		if inputCommand is not G(Grade),R(Rank), W(Weights), or E(Exit)
//			throws an object of NoSuchCommandExceptions  end if
//		else if inputCommand is E (Exit) then return inputCommand
//		else:
//			situation 1 : G
//			situation 2 : R
//			situation 3 : W
//		end if
//	return inputCommand
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	promptID() ask for user's ID
//	return: ID or Q
//	-------------------------------------------------------------------------------------------------------------*/
//	prompt user for ID or command Q
//		if input is Q
//			returnValue is Q
//		else if input is ID
//			returnValue is ID
//		end if
//	return returnValue
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	showFinishMsg() show msg in the end
//	return: boolean 
//	-------------------------------------------------------------------------------------------------------------*/
//	print the msg : 結束了
//	return true
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	showWelcomeMsg(name) show msg in the beginning
//	parameter: user's name
//	return: boolean 
//	-------------------------------------------------------------------------------------------------------------*/
//	print the welcome msg to user, e.g.: Welcome 李威廷
//	return true
//end class UI

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
