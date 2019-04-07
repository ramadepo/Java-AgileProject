/** ***************************************************
class GradeSystems  aGradeSystem contain a tree of anEntry objects with key ID and value aGrade

containID(ID)
GradeSystems(file) construct aGradeSystem
showGrade (ID)
showRank (ID)
updateWeights ()   
******************************************************/
public class GradeSystems 
	double[5] weights; // initialize with lab1 0.1, lab2 0.1, lab3 0.1, midTerm 0.3, finalExam 0.4
	TreeMap <String, Grades> aTree; 
	// String is the KEY (ID) class; Grades is the VALUE class
	/* use object of TreeMap class, aTree, to store anEntry objects. 
	   It's node is a pair of KEY (ID) and VALUE (aGrade object)
	   It's a binary search tree, so right node's key more than root’s key.*/
	
	/*----------------------------------------------------------------------------------------------------------
	GradeSystems(file) construct aGradeSystem with aTree
	parameter: file path
	time: O(n * log n)  (n is total people in aGradeSystem)
	----------------------------------------------------------------------------------------------------------*/
	open input file “gradeInput.txt”
	use Java TreeMap contruct a tree of anEntry(key, value) objects which called aTree
	read line
	while not endOfFile
		call Grades() contruct aGrade
		call Entry() contruct anEntry
		use Java Scanner scan line,ID stored in key, others stored in aGrade(value), the (key,value) is anEntry
		aGrade.calculateTotalGrade(weights) return aTotalGrade, which is stored in aGrade
		make anEntry stored in aTree
	end while
	
	/*-------------------------------------------------------------------------------------------------------------
	containID  judge whether aGradeSystem contain this ID or not
	parameter: ID (e.g.: 123456789)
	exception: NoSuchIDExceptions
	return: boolean
	time: O(log n)  (n is total people in aGradeSystem)
	-------------------------------------------------------------------------------------------------------------*/
	for anEntry in aTree
		if ID == ID of anEntry then return true 
		end if 
	end for 
	throw an object of NoSuchIDExceptions
	
	/*-------------------------------------------------------------------------------------------------------------
	showGrade(ID) show each grade of user
	parameter: ID (e.g.: 123456789)
	return: boolean
	time: O(log n)  (n is total people in aGradeSystem)
	-------------------------------------------------------------------------------------------------------------*/
	for anEntry in aTree
		if ID == ID of anEntry
			print out  all it's grade in aGrade
		end if
	end for
	
	/*-------------------------------------------------------------------------------------------------------------
	showRank(ID) show the rank of user's total grade
	parameter: ID (e.g.: 123456789)
	return: boolean
	time: O(n + log n)  (n is total people in aGradeSystem)
	-------------------------------------------------------------------------------------------------------------*/
	get user's theTotalGrade by ID
	initialize rank is 1 
	for anEntry in aTree 
		if aTotalGrade > theTotalGrade then rank+1
		end if 
	end for
	show user's rank

	/*-------------------------------------------------------------------------------------------------------------
	updateWeights() update the weight of each grade
	return: boolean
	time: O(n)  (n is total people in aGradeSystem)
	-------------------------------------------------------------------------------------------------------------*/
	showOldWeights
	getNewWeights
	confirmNewWeights
	setWeights(weights)
	for anEntry in aGradeSystem 
		calculateTotalGrade(weights) then save it 
	end for
	 
end class GradeSystems