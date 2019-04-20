///** ***************************************************
//class GradeSystems  aGradeSystem contain a tree of anEntry objects with key ID and value aGrade
//
//containID(ID)
//GradeSystems(file) construct aGradeSystem
//showGrade (ID)
//showRank (ID)
//updateWeights ()   
//******************************************************/
//public class GradeSystems 
//	double[5] weights; // initialize with lab1 0.1, lab2 0.1, lab3 0.1, midTerm 0.3, finalExam 0.4
//	TreeMap <String, Grades> aTree; 
//	// String is the KEY (ID) class; Grades is the VALUE class
//	/* use object of TreeMap class, aTree, to store anEntry objects. 
//	   It's node is a pair of KEY (ID) and VALUE (aGrade object)
//	   It's a binary search tree, so right node's key more than root’s key.*/
//	
//	/*----------------------------------------------------------------------------------------------------------
//	GradeSystems(file) construct aGradeSystem with aTree
//	parameter: file path
//	time: O(n * log n)  (n is total people in aGradeSystem)
//	----------------------------------------------------------------------------------------------------------*/
//	open input file “gradeInput.txt”
//	use Java TreeMap contruct a tree of anEntry(key, value) objects which called aTree
//	read line
//	while not endOfFile
//		call Grades() contruct aGrade
//		call Entry() contruct anEntry
//		use Java Scanner scan line,ID stored in key, others stored in aGrade(value), the (key,value) is anEntry
//		aGrade.calculateTotalGrade(weights) return aTotalGrade, which is stored in aGrade
//		make anEntry stored in aTree
//	end while
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	containID  judge whether aGradeSystem contain this ID or not
//	parameter: ID (e.g.: 123456789)
//	exception: NoSuchIDExceptions
//	return: boolean
//	time: O(log n)  (n is total people in aGradeSystem)
//	-------------------------------------------------------------------------------------------------------------*/
//	for anEntry in aTree
//		if ID == ID of anEntry then return true 
//		end if 
//	end for 
//	throw an object of NoSuchIDExceptions
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	showGrade(ID) show each grade of user
//	parameter: ID (e.g.: 123456789)
//	return: boolean
//	time: O(log n)  (n is total people in aGradeSystem)
//	-------------------------------------------------------------------------------------------------------------*/
//	for anEntry in aTree
//		if ID == ID of anEntry
//			print out  all it's grade in aGrade
//		end if
//	end for
//	
//	/*-------------------------------------------------------------------------------------------------------------
//	showRank(ID) show the rank of user's total grade
//	parameter: ID (e.g.: 123456789)
//	return: boolean
//	time: O(n + log n)  (n is total people in aGradeSystem)
//	-------------------------------------------------------------------------------------------------------------*/
//	get user's theTotalGrade by ID
//	initialize rank is 1 
//	for anEntry in aTree 
//		if aTotalGrade > theTotalGrade then rank+1
//		end if 
//	end for
//	show user's rank
//
//	/*-------------------------------------------------------------------------------------------------------------
//	updateWeights() update the weight of each grade
//	return: boolean
//	time: O(n)  (n is total people in aGradeSystem)
//	-------------------------------------------------------------------------------------------------------------*/
//	showOldWeights
//	getNewWeights
//	confirmNewWeights
//	setWeights(weights)
//	for anEntry in aGradeSystem 
//		calculateTotalGrade(weights) then save it 
//	end for
//	 
//end class GradeSystems

package main;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class GradeSystems {
	private double[] weights = new double[5];
	private TreeMap<String, Grades> aTree;
	
	public GradeSystems(String file) {
		this.weights[0] = 0.1;
		this.weights[1] = 0.1;
		this.weights[2] = 0.1;
		this.weights[3] = 0.3;
		this.weights[4] = 0.4;
		this.aTree = new TreeMap<>();
		
		String line;
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader reader = new BufferedReader(filereader);
			while((line = reader.readLine()) != null) {
				String[] token = line.split(" ");
				Grades aGrade = new Grades(token[1], Double.parseDouble(token[2]), Double.parseDouble(token[3]), Double.parseDouble(token[4]), Double.parseDouble(token[5]), Double.parseDouble(token[6]));
				aGrade.calculateTotalGrade(this.weights);
				this.aTree.put(token[0], aGrade);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Grades containID(String ID) {
		if(this.aTree.containsKey(ID)) {
			return this.aTree.get(ID);
		}
		else {
			return null;
		}
	}
	public boolean showGrade(String ID) {
		Grades aGrade = this.aTree.get(ID);
		System.out.print(aGrade.name + "成績：lab1：    " + Math.round(aGrade.lab1) + "\n" +
									"\t  lab2：    " + Math.round(aGrade.lab2) + "\n" +
									"\t  lab3：    " + Math.round(aGrade.lab3) + "\n" +
									"\t  midterm exam：    " + Math.round(aGrade.mid) + "\n" +
									"\t  final exam：    " + Math.round(aGrade.fin) + "\n" +
									"    totoal grade：    " + Math.round(aGrade.total_grade) + "\n");
		
		return true;
	}
	public boolean showRank(String ID) {
		Integer rank = 1;
		Grades aGrade = this.aTree.get(ID);
		double total_grade = aGrade.total_grade;
		
		for(Map.Entry<String, Grades> entry : this.aTree.entrySet()) {
			if(entry.getValue().total_grade > total_grade) {
				rank += 1;
			}
		}
		
		System.out.print(aGrade.name + "排名第" + rank + "\n");
		return true;
	}
	public boolean updateWeights() {
		Scanner scan = new Scanner(System.in);
		int lab1, lab2, lab3, mid, fin;
		
		System.out.print("舊配分" + "\n" + 
							"lab1\t" + (int)(this.weights[0]*100) + "%\n" +
							"lab2\t" + (int)(this.weights[1]*100) + "%\n" +
							"lab3\t" + (int)(this.weights[2]*100) + "%\n" +
							"midterm exam\t" + (int)(this.weights[3]*100) + "%\n" +
							"final exam\t" + (int)(this.weights[4]*100) + "%\n" +
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
							"lab1\t" + lab1 + "%" + "\n" +
							"lab2\t" + lab2 + "%" + "\n" + 
							"lab3\t" + lab3 + "%" + "\n" + 
							"midterm exam\t" + mid + "%" + "\n" + 
							"final exam\t" + fin + "%" + "\n" + 
							"以上正確嗎? Y (Yes) 或 N (No)\t");
		
		char answer = scan.next().charAt(0);
		if(answer == 'Y') {
			this.weights[0] = (double)lab1/100;
			this.weights[1] = (double)lab2/100;
			this.weights[2] = (double)lab3/100;
			this.weights[3] = (double)mid/100;
			this.weights[4] = (double)fin/100;
			
			for(Map.Entry<String, Grades> entry : this.aTree.entrySet()) {
				entry.getValue().calculateTotalGrade(this.weights);
			}
			
			return true;
		}
		else {
			return false;
		}
	}
}
