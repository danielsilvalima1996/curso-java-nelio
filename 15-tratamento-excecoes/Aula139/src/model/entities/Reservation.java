package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diff = this.checkout.getTime() - this.checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public String updateDate(Date checkin, Date checkout) {
		Date now = new Date();

		if (checkin.before(now) || checkout.before(now)) {
			return "As datas para atualização não podem ser anteriores a data atual!";
		} else if (!checkout.after(checkin)) {
			return "Data do check-out não pode ser menor que a data do check-in!";
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
		return null;
	}

	@Override
	public String toString() {
		return "Quarto " 
				+ this.roomNumber 
				+ ", check-in: " 
				+ sdf.format(this.checkin) 
				+ ", checkout: "
				+ sdf.format(this.checkout) 
				+ ", " 
				+ this.duration() + " noites.";
	}

}