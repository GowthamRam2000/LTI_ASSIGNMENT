public class Assignment5_abs_currAcc extends Assignement5_Abstract {
private int overDraftLim;

    public int getOverDraftLim() {
        return overDraftLim;
    }

    public void setOverDraftLim(int overDraftLim) {
        this.overDraftLim = overDraftLim;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println(getOverDraftLim());
    }
}
