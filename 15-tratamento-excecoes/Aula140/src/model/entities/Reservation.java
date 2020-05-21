package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		if (!checkout.after(checkin)) {
			throw new DomainException("Data do check-out não pode ser menor que a data do check-in!");
		}
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

	public void updateDate(Date checkin, Date checkout) {
		Date now = new Date();

		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("As datas para atualização não podem ser anteriores a data atual!");
		} else if (!checkout.after(checkin)) {
			throw new DomainException("Data do check-out não pode ser menor que a data do check-in!");
		}

		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Quarto " + this.roomNumber + ", check-in: " + sdf.format(this.checkin) + ", checkout: "
				+ sdf.format(this.checkout) + ", " + this.duration() + " noites.";
	}

}