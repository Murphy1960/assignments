 package kiptooo;

import java.util.Scanner;

class Book
{
String title;
String author;
int numberOfPages;
}


public class BookInputTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Book prac = new Book();
		System.out.println("Please enter the title of the book");
		prac.title= input.nextLine();
		System.out.println("Please enter the author name");
		prac.author = input.nextLine();
		System.out.println("Please enter the number of pages");
		prac.numberOfPages = input.nextInt();
		
		System.out.println("The book title is: " +prac.title);
		System.out.println("The author is: " +prac.author);
		System.out.println("The book has " +prac.numberOfPages+ " pages");
		

	}

}