class Book extends Libraryitem{
	private String author;
	private int numpages;
	
	public Book(String title,String itemid,String author,int numpages){
		super(title,itemid);
		this.author=author;
		this.numpages=numpages;
	}
	
	public void Displayitemdetails(){
		super.displayitemdetails();
		System.out.println("Author: "+author);
		System.out.println("Number Of Pages: "+numpages);
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getNumpages(){
		return numpages;
	}
	
	public void setNumpages(String numpages){
		this.numpages = numpages;
	}
}