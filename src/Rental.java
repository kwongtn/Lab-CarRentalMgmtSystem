public class Rental{
    private int rentalID;
    private int carID;
    private int customerID;
    private int contractualDuration;
    private long start;
    private long end;
    private double total;
    private double deposit;

    // Getter & Setter for rentalID
    public int getRentalID(){
        return rentalID;
    }
    public void setRentalID(int rentalID){
        this.rentalID = rentalID;
    }

    // Getter & Setter for carID
    public int getCarID(){
        return carID;
    }
    public void setCarID(int carID) {
        this.carID = carID;
    }

    // Getter & Setter for customerID
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    // Getter & Setter for contractualDuration
    public int getContractualDuration() {
        return contractualDuration;
    }
    public void setContractualDuration(int contractualDuration){
        this.contractualDuration = contractualDuration;
    }

    // Getter & Setter for start
    public long getStart(){
        return start;
    }
    public void setStart(long start) {
        this.start = start;
    }

    // Getter & Setter for end
    public long getEnd() {
        return end;
    }
    public void setEnd(long end) {
        this.end = end;
    }

    // Getter & Setter for total
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    // Getter & Setter for deposit
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

}