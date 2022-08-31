public class Assignment_5_currAcc extends Assignment_5_Main {
    private double minBal;

    public double getMinBal() {
        return minBal;
    }

    public void setMinBal(double minBal) {
        this.minBal = minBal;
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println(getMinBal());
    }

    public Assignment_5_currAcc(int accNo, double accBal, String accPass, String bankName, double minBal) {
        super(accNo, accBal, accPass, bankName);
        this.minBal = minBal;

    }

    public Assignment_5_currAcc() {

    }
}
