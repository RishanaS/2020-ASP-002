abstract class Libraryitem{
	private string title;
	private string itemid;
	private boolean checkedout;
    
	
	public Libraryitem(String title,String itemid){
		this.title=title;
		this.itemid=itemid;
		this.checkedOut=false;
	}
	
	 public void Checkout() {
        checkedOut = true;
    }
    
    public void Checkin() {
        checkedOut = false;
    }
	
	public void Displayitemdetails(){
		System.out.println("Title: "+title);
		System.out.println("Item ID: "+itemid);
		System.out.println("Checked Out: "+checkedout);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	
	public String getItemid(){
		return itemid;
	}
	
	public void setItemid(String itemid){
		this.itemid = itemid;
	}
	
	
	public boolean isCheckedout(){
		return checkedout;
	}
}