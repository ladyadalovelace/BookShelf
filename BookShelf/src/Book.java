
public class Book {
	private String title;
	private String author;
	private boolean hasRead;
	
	public Book(String t, String a, boolean hr)
	{
		title = t;
		author = a;
		hasRead = hr;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		String concat = author + " " + title;
		for(int i = 0; i < concat.length(); i++)
		{
			hash += (i+1) * concat.charAt(i);
		}
		return hash;
	}
	
	@Override
	public boolean equals(Object o){
		Book other = (Book)o;
		return this.title.equals(other.getTitle()) && this.author.equals(other.getAuthor());
	}
	
	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	public boolean getRead() { return hasRead; }
	public String toString() { return author + " " + title; }
}
