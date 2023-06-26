package Payment;

import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargeable> iChargeables;
    private IChargeable selectedIChargeable;

    public Wallet(ArrayList<IChargeable> iChargeables, IChargeable selectedIChargeable) {
        this.iChargeables = iChargeables;
        this.selectedIChargeable = selectedIChargeable;
    }

    public void setiChargeables(ArrayList<IChargeable> iChargeables) {
        this.iChargeables = iChargeables;
    }

    public void setSelectedIChargeable(IChargeable selectedIChargeable) {
        this.selectedIChargeable = selectedIChargeable;
    }

    public IChargeable getSelectedIChargeable() {
        return selectedIChargeable;
    }

    public ArrayList<IChargeable> getiChargeables() {
        return iChargeables;
    }

    public void addNewIChargeable(IChargeable iChargeable){
        this.iChargeables.add(iChargeable);
    }
}


