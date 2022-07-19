package Discussion46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;



class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name);
	}
	
	
   
    
}

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
		
		List<Book> library=new ArrayList<Book>(Arrays.asList(b1,b2,b3,b4));
		
		Set<Book> set=new HashSet<>();
		
		for (int i = 0; i < library.size(); i++) {
            for (int j = i + 1; j < library.size(); j++) {
                if (library.get(i).equals(library.get(j))) {
                    
                    if(library.get(i).quantity>library.get(j).quantity) {
                    	 set.add(library.get(i));
                    }
                    else if(library.get(j).quantity>library.get(i).quantity) {
                    	set.add(library.get(j));
                    }
                }
            }
        }
        System.out.println("No. of duplicate books = "+ set.size());
       for(Book b:set) {
    	   System.out.println(b);
       }
       
       

	}

}
