package Workshop07.ship;


public abstract class Ship {
	private String shipName;
	private int fuelTank;
	public Ship(){}
	
	
	
	@Override
	public String toString() {
		return "Ship Name=" + shipName + ", fuelTank=" + fuelTank + "]";
	}



	public Ship(String shipName, int fuelTank) {
		super();
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	
	public abstract void sail (int dist);
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
	
	
}
