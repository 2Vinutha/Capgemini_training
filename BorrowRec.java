package Training;

public class BorrowRec {
	private String bookTitle;
	private int copiesBorrowed;
	private double totalFine;
	public BorrowRec(String bookTitle,int copiesBorrowed,double totalFine) {
		this.bookTitle=bookTitle;
		this.copiesBorrowed=copiesBorrowed;
		this.totalFine=totalFine;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getCopiesBorrowed() {
		return copiesBorrowed; 
	}
	public void setCopiesBorrowed(int copiesBorrowed) {
		this.copiesBorrowed = copiesBorrowed;
	}
	public double getTotalFine() {
		return totalFine;
	}
	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}
}
