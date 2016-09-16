import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookShelf {

	private Set<Book> books;
	
	
	public BookShelf() { books = new HashSet<Book>(); }
	
	public void addBook(Book a) { books.add(a); }
	
	public void removeRead()
	{
		Iterator<Book> iter = books.iterator();
		Set<Book> temp = new HashSet();
		while(iter.hasNext())
		{
			Book x = iter.next();
			if(x.getRead() == false)
			{
				temp.add(x);
			}
		}
		books = temp;
	}
	
	public String toString() { return books.toString(); }
	
	public static void main(String[] args)
	{
		BookShelf b = new BookShelf();
		b.addBook(new Book("Catcher in the Rye", "Salinger", false));
		b.addBook(new Book("Twilight", "Meyer", true));
		b.addBook(new Book("AP Calculus", "Mazzoni", true));
		b.addBook(new Book("Five Steps to a Five Chem", "Ford", false));
		b.addBook(new Book("Harry Potter", "Rowling", true));
		b.addBook(new Book("Harry Potter", "Rowling", true));
		System.out.println(b);
		b.removeRead();
		System.out.println(b);
	}
	
	
	
	
	

}
