class Book{
	private String author_name;

	Book(String author_name){
		this.author_name = author_name;
	}

	public void display(){
		System.out.println("Author: "+this.author_name);
	}
}

class Book_publication extends Book{
	private String title;

	Book_publication(String author_name, String title){
		super(author_name);
		this.title = title;
	}

	public void display(){
		System.out.println("Book Details...");
		super.display();
		System.out.println("Book Title: "+this.title);
	}
}

class Paper_publication extends Book{
	private String title;
		
	Paper_publication(String author_name, String title){
		super(author_name);
		this.title = title;
	}

	public void display(){
		System.out.println("Paper Details...");
		super.display();
		System.out.println("Paper Title: "+this.title);
	}
}

public class P4{
	public static void main(String[] args){
		String a = args[0];
		String b = args[1];
		String c = args[2];

		Book b1;

		if(b.equalsIgnoreCase("book")){
			b1 = new Book_publication(a,c);
		}

		else if(b.equalsIgnoreCase("paper")){
			b1 = new Paper_publication(a,c);
		}

		else{
			System.out.println("Invalid");
			return;
		}

		b1.display();
	}
}