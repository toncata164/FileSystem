package edu.school.filesystem;

public class Folder extends FileSystemObject{

	private FileSystemObject[] content;
	private int contentSize;
	private int currentObject;
	
	public Folder(String name) {
		super(name);
		contentSize = 20;
		content = new FileSystemObject[contentSize];
		currentObject = 0;
	}
	
	public Folder(Folder toCopy)
	{
		super(toCopy.getName());
		contentSize = toCopy.contentSize;
		content = new FileSystemObject[contentSize];
		currentObject = 0;
		for(int i = 0; i<toCopy.currentObject; i++)
		{
			add(toCopy.content[i]);
		}
	}
	
	public boolean contains(FileSystemObject f)
	{
		for(int i = 0; i<currentObject; i++)
		{
			if(f.getName().equals(content[i].getName()))
				return true;
		}
		return false;
	}
	
	public void add(FileSystemObject f)
	{
		if(!contains(f))
		{
			content[currentObject++] = f.clone();
			if(currentObject == contentSize)
			{
				FileSystemObject[] a = content;
				content = new FileSystemObject[contentSize+20];
				for(int i = 0;i<contentSize; i++)
					content[i] = a[i];
				contentSize+=20;
			}
		}
	}

	@Override
	public int getSize() {
		int size = 0;
		for(int i = 0; i<currentObject; i++)
		{
			size+=content[i].getSize();
		}
		return size;
	}

	@Override
	public FileSystemObject clone() {
		return new Folder(this);
	}

}
