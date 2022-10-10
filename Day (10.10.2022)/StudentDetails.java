package com;

public class StudentDetails {
	int id;
	String name;
	StudentAddress ad; // reff. entity (aggrigation)

	public StudentDetails(int id, String name, StudentAddress ad) {
		this.id = id;
		this.name = name;
		this.ad = ad;

	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(ad.area + " " + ad.city + " " + ad.district);
	}

	public static void main(String[] args) {
		StudentAddress s1 = new StudentAddress("Dakshinayan", "Chinsurah", "hooghly");
		StudentDetails s2 = new StudentDetails(5, "Niladri", s1);
		s2.show();
	}

}
