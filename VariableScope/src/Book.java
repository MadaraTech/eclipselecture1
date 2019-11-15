
public class Book {

private int author;
private int pages;
private int title;

public Book(){
this("", Rainis, 150);
}
public Book(String name){
	this(name, Rainis, 150);
}
public Book(String name, int title, int pages){
	this.author = author;
	this.title = title;
	this.pages = pages;
	System.out.println("");
}
	
	public static void main(String[] args) {


	}

}

/*Create a class Book, which:
◦ has fields: author, pages, title.
◦ has constructor which defines all fields
◦ has constructor which allows to define title, but author and pages are set to
default
◦ has constructor which reuses another one*/