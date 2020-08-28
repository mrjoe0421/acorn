package workshop07.shop;

public abstract class Ship {
	private String shipName;
    private int fuelTank;
    
    public Ship() {}
    public Ship(String shipName, int fuelTank) {
        this.shipName = shipName;
        this.fuelTank = fuelTank;
    }
    
    public abstract void sail(int dist);
    
    public abstract void refuel(int fuel);
    
    public String getShipName() {
        return shipName;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    public int getFuelTank() {
        return fuelTank;
    }
    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
	@Override
	public String toString() {
		return "shipName=" + shipName + ", fuelTank=" + fuelTank ;
	}

}
