package edu.school.filesystem;

public abstract class FileSystemObject {
	public abstract int getSize();
	public abstract FileSystemObject clone();
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public FileSystemObject(String name)
	{
		setName(name);
	}
}
