class Librarymember{
	private String memberid;
	private String name;
	
	public Librarymember(String memberid,String name){
		this.memberid=memberid;
		this.name=name;
	}
	
	public void Displayitemdetails(){
		System.out.println("Member ID: "+memberid);
		System.out.println("Name: "+name);
	}
	
	public String getMemberid(){
		return memberid;
	}
	
	public void setMemberid(String memberid){
		this.memberid = memberid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	
}