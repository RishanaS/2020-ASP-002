class Magazine extends Libraryitem{
	private String issuedate;
	private String publisher;
	
	public Magazine(String title,String itemid,String issuedate,String publisher){
		super(title,itemid);
		this.issuedate=issuedate;
		this.publisher=publisher;
	}
	
	public void Displayitemdetails(){
		super.displayitemdetails();
		System.out.println("Issue Date: "+issuedate);
		System.out.println("Publicher: "+publisher);
	}
	
	public String getIssuedate(){
		return issuedate;
	}
	
	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
}