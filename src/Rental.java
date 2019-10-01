public class Rental{
    private int rentalID;
    Car car;
    Customer customer;
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

    // Getter & Setter for car
    public int getcar(){
        return car;
    }
    public void setcar(int car) {
        this.car = car;
    }

    // Getter & Setter for customer
    public int getcustomer() {
        return customer;
    }
    public void setcustomer(int customer) {
        this.customer = customer;
    }

    // Getter & Setter for contractualDuration
    public int getContractualDuration() {
        return contractualDuration;
    }
    public void setContractualDuration(int contractualDuration){
        if (contractualDuration > 0){
            this.contractualDuration = contractualDuration;
            this.total = contractualDuration * car.getPrice();
        }
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

    // Getter & Setter for deposit
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

}