package javaproject;

public class javaproject6 {
	String partNumber;
	String partDescription;
	int quantity;
	int price;
	
    public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity<0)
		System.out.println(0);
		else
		this.quantity = quantity;
	 
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0)
		System.out.println(0);
		else
			this.price = price;
		}
    public void getInvoiceAmount()
    {
    	quantity=quantity*price;
    	System.out.println(quantity);
    }
	public static void main(String args[]){
    	javaproject6 invoice = new javaproject6();
    	invoice.setQuantity(5);
    	invoice.setPrice(100);
    	invoice.getInvoiceAmount();
    	
	}
	}

	