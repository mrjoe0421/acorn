package Workshop07.ship;

public class Boat extends Ship{
	public Boat() {}
	public Boat(String shipname, int fuelTank) {
		super(shipname, fuelTank);
	}
	
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist *10));
	}
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 10));
	}
}
