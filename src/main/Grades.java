package main;


public class Grades {
	public String name;
	public double lab1, lab2, lab3, mid, fin;
	
	public Grades(String name, double lab1, double lab2, double lab3, double mid, double fin) {
		this.name = name;
		this.lab1 = lab1;
		this.lab2 = lab2;
		this.lab3 = lab3;
		this.mid = mid;
		this.fin = fin;
	}
	public double calculateTotalGrade(double weights[]) {
		return lab1*weights[0] + lab2*weights[1] + lab3*weights[2] + mid*weights[3] + fin*weights[4];
	}
}