package librarySystem;

public class Book {
	private int id;
	private String name;
	private String auther;
	private int qty;
	private boolean status;
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
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Book(int id, String name, String auther, int qty, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.qty = qty;
		this.status = status;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String bookStatus(boolean status) {
		if (status==true) {return "Available";}
		else {return "borrowed";}
	}
	 @Override
	    public String toString() {
	        String statusString = (status) ? "Available" : "Borrowed";
	        return "id=" + id + ", name=" + name + ", 		author=" + auther + ", 		qty=" + qty + ", 		status=" + statusString ;
	    }
	
	
	
	
	

}
