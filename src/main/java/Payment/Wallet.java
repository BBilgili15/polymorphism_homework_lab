package Payment;

import java.util.ArrayList;

public class Wallet {
    private final ArrayList<IChargeable> iChargeables;
    private IChargeable selectedIChargeable;

    public Wallet() {
        this.iChargeables = new ArrayList<IChargeable>();
        this.selectedIChargeable = null;
    }

    public void setSelectedIChargeable(IChargeable selectedIChargeable) {
        this.selectedIChargeable = selectedIChargeable;
    }

    public IChargeable getSelectedIChargeable() {
        return selectedIChargeable;
    }

    public ArrayList<IChargeable> getIChargeables() {
        return iChargeables;
    }

    public void addNewIChargeable(IChargeable iChargeable){
        this.iChargeables.add(iChargeable);
    }
}


