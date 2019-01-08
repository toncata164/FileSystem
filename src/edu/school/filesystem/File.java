package edu.school.filesystem;

public class File extends FileSystemObject{
	private int size;
	
	public File(String name, int size) {
		super(name);
		setSize(size);
	}
	
	public File()
	{
		this("new file", 0);
	}
	
	public File(File toCopy)
	{
		this(toCopy.getName(), toCopy.getSize());
	}

	@Override
	public int getSize() {
		return size;
	}
	
	public void setSize(int size)
	{
		if(size < 0)
			return;
		this.size = size;
	}

	@Override
	public FileSystemObject clone() {
		return new File(this);
	}
	

}
