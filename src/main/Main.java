///*##################################################################
//This Grade system let user(student) to get their total grade and rank.
//total grade is based on weights to calculate, and weights can be updated. 
//Rank show their rank of total grade in class.
//
//Input file: all students' grade, e.g.:
//	962001044 凌宗廷 87 86 98 88 87
//	962001051 李威廷 81 98 84 90 93
//Data columns: 
//	ID     	  name lab1 lab2 lab3 midtermExam finalExam
//###################################################################*/
//public class Main extends Object {
//	public static void main (String args[]) 
//	/*------------------------------------------------------------------------------------------------------
//	main()
//	Exceptions: NoSuchIDExceptions, NoSuchCommandExceptions
//	------------------------------------------------------------------------------------------------------*/
//		try 
//			call UI() construct aUI
//			call GradeSystems() construct aGradeSystem
//		
//			loop1 until user input Q(Quit)
//				aUI use promptID() to get user's input : ID or Q 
//				aGradeSystem use containID() judge whether ID exist or not
//				aUI use showWelcomeMsg(ID)      e.g.: Welcome李威廷
//				loop2 until user input E(Exit)
//					aUI use promptCommand() to prompt for inputCommand 
//				end loop2
//			end loop1
//			aUI use showFinishMsg() to show msg: 結束了
//		end try
//		finally {}
//		catch (NoSuchIDExceptions       e1) {print msg1} //ID錯了!
//		catch (NoSuchCommandExceptions e2) {print msg2} //指令錯了!
//end class Main

package main;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		try {
			UI aUI = new UI();
			GradeSystems aGradeSystem = new GradeSystems("data/gradeInput.txt");
			String ID, command;
			while(true){
				ID = aUI.promptID();
				if(ID.equals("Q")) {
					break;
				}
				if(aGradeSystem.containID(ID) != null) {
					Grades aGrade = aGradeSystem.containID(ID);
					aUI.showWelcomeMsg(aGrade.name);
					while(true) {
						command = aUI.promptCommand();
						if(command.equals("G")) {
							aGradeSystem.showGrade(ID);
						}
						else if(command.equals("R")) {
							aGradeSystem.showRank(ID);
						}
						else if(command.equals("W")) {
							aGradeSystem.updateWeights();
						}
						else if(command.equals("E")) {
							break;
						}
						else {
							throw new NoSuchCommandExceptions("指令錯了!");
						}	
					}
				}
				else {
					throw new NoSuchIDExceptions("ID錯了!");
				}
			}
			System.out.println("結束了");
		}
		catch(NoSuchCommandExceptions e){
			e.printStackTrace();
		}
		catch(NoSuchIDExceptions e){
			e.printStackTrace();
		}
	}
}
