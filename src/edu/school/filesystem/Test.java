package edu.school.filesystem;

public class Test {

	public static void main(String[] args) {
		Folder ivan = new Folder("ivan");
		ivan.add(new File("ocenki", 1673));
		ivan.add(new File("java", 26545));
		Folder d = new Folder("D:");
		d.add(new File("shkola", 12));
		d.add(new File("kontrolno", 5));
		d.add(ivan);
		System.out.println(d.getSize());
		ivan.add(new File("kartinka", 100000));
		System.out.println(d.getSize());
	}

}
