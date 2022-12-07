package colection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingUserDefined1 {

	public static void main(String[] args) {
		Bank b = new Bank(12345, "Niladri", 5000.57, 20);
		Bank b1 = new Bank(12346, "Soumya", 6000.58, 21);
		Bank b2 = new Bank(12347, "Nisha", 7000.59, 22);
		Bank b3 = new Bank(12348, "Avishek", 8000.55, 23);
		Bank b4 = new Bank(12349, "Misbah", 9000.56, 24);
		Bank b5 = new Bank(12350, "Shifa", 4000.55, 25);
		ArrayList<Bank> a1 = new ArrayList<Bank>();

		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);

		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			Bank obj = (Bank) itr.next();
			System.out.println(obj.accountNo + " " + obj.customerName + " " + obj.balance + " " + obj.customerAge);
		}

	}

}
