//an array program to copy from sourse to destination
public class CopyArray { // class
	public static void main(String[] args) {
		// declearing a source array
		char[] copyFrom = { 'd', 'e', 'c', 'f', 'f', 'e', 'i', 'n' };
		// declearing a Destination array
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}
