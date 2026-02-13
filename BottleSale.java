package Training;

public class BottleSale {
	private String sizeLabel;
	private int quantitySold;
	private double totalSale;
	public BottleSale(String sizeLabel,int quantitySold,double totalSale) {
		this.sizeLabel=sizeLabel;
		this.quantitySold=quantitySold;
		this.totalSale=totalSale;
	}
	public String getSizeLabel() {
		return sizeLabel;
	}
	public void setSizeLabel(String sizeLabel) {
		this.sizeLabel = sizeLabel;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public double getTotalSale() {
		return totalSale;
	}
	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}
}
