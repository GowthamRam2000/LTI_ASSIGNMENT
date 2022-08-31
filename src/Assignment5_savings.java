public class Assignment5_savings extends Assignment_5_Main{
    private double overdraftLim;

    public Assignment5_savings(int accNo, double accBal, String accPass, String bankName, double overdraftLim) {
        super(accNo, accBal, accPass, bankName);
        this.overdraftLim = overdraftLim;
    }

    public Assignment5_savings() {
    }

    public double getOverdraftLim() {
        return overdraftLim;
    }

    public void setOverdraftLim(double overdraftLim) {
        this.overdraftLim = overdraftLim;
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println(overdraftLim);
    }
}
