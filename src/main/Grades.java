///** **********************************************************************
//class Grades  aGrade store name, lab1, lab2, lab3, midtermExam, finalExam, totalGrade
//
//calculateTotalGrade(weights)
//Grades(name, lab1, lab2, lab3, midtermExam, finalExam) construct aGrade
//*************************************************************************/

package pair16SourceCode;

//public class Grades
//	String name;
//	int lab1, lab2, lab3, midtermExam, finalExam, totalGrade;
public class Grades {
	public String name;
	public double lab1, lab2, lab3, mid, fin, total_grade;
	
//	/*----------------------------------------------------------------------------------------------------------
//	Grades(name, lab1, lab2, lab3, midtermExam, finalExam) constructor initialize user's information
//	parameter: name, lab1, lab2, lab3, midtermExam, finalExam
//	----------------------------------------------------------------------------------------------------------*/
//	user's name is name
//	user's grade of lab1 is lab1
//	user's grade of lab2 is lab2
//	user's grade of lab3 is lab3
//	user's grade of midterm exam is midtermExam
//	user's grade of final exam is finalExam
	public Grades(String name, double lab1, double lab2, double lab3, double mid, double fin) {
		this.name = name;
		this.lab1 = lab1;
		this.lab2 = lab2;
		this.lab3 = lab3;
		this.mid = mid;
		this.fin = fin;
	}

//	/*-------------------------------------------------------------------------------------------------------------
//	calculateTotalGrade(weights) calculate user's total grade
//	parameter: weights
//	return: total grade
//	-------------------------------------------------------------------------------------------------------------*/
//	calculate total grade from user's information and weights
//	store total grade in totalGrade
//	return totalGrade
	public double calculateTotalGrade(double weights[]) {
		this.total_grade = lab1*weights[0] + lab2*weights[1] + lab3*weights[2] + mid*weights[3] + fin*weights[4];
		return this.total_grade;
	}
}
//end class Grades
