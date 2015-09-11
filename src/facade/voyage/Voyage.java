package facade.voyage;

public class Voyage {
	private Hotel hotel;
	private AirLine airLine;

	public Voyage() {
		this.hotel = new Hotel();
		this.airLine = new AirLine();
	}

	public void planTrip() {
		System.out.println("Let facade plan trip");
		hotel.bookRoom();
		airLine.bookTicket();
	}
}
