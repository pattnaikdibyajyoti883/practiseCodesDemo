package javacodesforpractise;


public class Books {
String bookname;
int price;
int isbn;

void genre(String genre)
{
	System.out.println("The genre of the number is " + genre);
}
Books(String name,int price,int isbn)
{
	this.bookname=bookname;
	this.price=price;
	this.isbn=isbn;
}
}
class BookStore{
	public static void main(String[] args) 
	{
		Books[]shelf= {new Books("ABC",123,2),new Books("DEF", 234,2)};
		for (int i = 0; i < shelf.length; i++) 
		{
			System.out.println(shelf[i].bookname + " " + shelf[i].price + " " + shelf[i].isbn);
			shelf[i].genre("thriller");
		}
	}
}

