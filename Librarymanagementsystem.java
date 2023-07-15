public class Librarymanagementsystem{
	public static void main(String args[]){
		Book book1 = new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
		Book book2 = new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book book3 = new Book("1984","B003","George Orwell",328);
		Book book4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book book5 = new Book("The Hobbit","B005","J.R.R Tolkien",320);
		
		Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");


        Librarymember member1 = new Librarymember("L001", "John Doe");
        Librarymember member2 = new Librarymember("L002", "Jane Smith");
        Librarymember member3 = new Librarymember("L003", "David Johnson");
        Librarymember member4 = new Librarymember("L004", "Emily Brown");
        Librarymember member5 = new Librarymember("L005", "Michael Wilson");
		
		book1.Checkout();
        book1.Checkin();

		System.out.println("Books:");
        book1.displayitemdetails();
        System.out.println();
        book2.displayitemdetails();
        System.out.println();
        book3.displayitemdetails();
        System.out.println();
        book4.displayitemdetails();
        System.out.println();
        book5.displayitemdetails();
        System.out.println();
		
		 System.out.println("Magazines:");
        magazine1.displayitemdetails();
        System.out.println();
        magazine2.displayitemdetails();
        System.out.println();
        magazine3.displayitemdetails();
        System.out.println();
        magazine4.displayitemdetails();
        System.out.println();
        magazine5.displayitemdetails();
        System.out.println();

        System.out.println("Library Members:");
        member1.displaymemberdetails();
        System.out.println();
        member2.displaymemberdetails();
        System.out.println();
        member3.displaymemberdetails();
        System.out.println();
        member4.displaymemberdetails();
        System.out.println();
        member5.displaymemberdetails();
        System.out.println();
		
	}
}