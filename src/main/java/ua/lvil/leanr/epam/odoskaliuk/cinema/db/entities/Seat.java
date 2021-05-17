package ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities;

public class Seat {
	private int seatNumber;
	private int cinemaHallId;
	private int seatCatagoryId;
	private boolean isReserved;
	
	public Seat() {}
	
	public Seat(int seatNumber, int cinemaHallId, int seatCatagoryId, boolean isReserved) {
		this.seatNumber = seatNumber;
		this.cinemaHallId = cinemaHallId;
		this.seatCatagoryId = seatCatagoryId;
		this.isReserved = isReserved;
	}
	
	public static Seat createSeat(int seatNumber, int cinemaHallId, int seatCatagoryId, boolean isReserved) {
		return new Seat(seatNumber, cinemaHallId, seatCatagoryId, isReserved);
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getCinemaHallId() {
		return cinemaHallId;
	}

	public void setCinemaHallId(int cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}

	public int getSeatCatagoryId() {
		return seatCatagoryId;
	}

	public void setSeatCatagoryId(int seatCatagoryId) {
		this.seatCatagoryId = seatCatagoryId;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cinemaHallId;
		result = prime * result + (isReserved ? 1231 : 1237);
		result = prime * result + seatCatagoryId;
		result = prime * result + seatNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} 
		if (!(obj instanceof Seat)) {
			return false;
		}
		Seat seat = (Seat) obj;
		return seat.seatNumber == getSeatNumber();
	}
	
	
}
