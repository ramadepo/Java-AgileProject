/** **********************************************************************
class Grades  aGrade store name, lab1, lab2, lab3, midtermExam, finalExam, totalGrade

calculateTotalGrade(weights)
Grades(name, lab1, lab2, lab3, midtermExam, finalExam) construct aGrade
*************************************************************************/
public class Grades
	String name;
	int lab1, lab2, lab3, midtermExam, finalExam, totalGrade;
	/*----------------------------------------------------------------------------------------------------------
	Grades(name, lab1, lab2, lab3, midtermExam, finalExam) constructor initialize user's information
	parameter: name, lab1, lab2, lab3, midtermExam, finalExam
	----------------------------------------------------------------------------------------------------------*/
	user's name is name
	user's grade of lab1 is lab1
	user's grade of lab2 is lab2
	user's grade of lab3 is lab3
	user's grade of midterm exam is midtermExam
	user's grade of final exam is finalExam

	/*-------------------------------------------------------------------------------------------------------------
	calculateTotalGrade(weights) calculate user's total grade
	parameter: weights
	return: total grade
	-------------------------------------------------------------------------------------------------------------*/
	calculate total grade from user's information and weights
	store total grade in totalGrade
	return totalGrade
end class Grades