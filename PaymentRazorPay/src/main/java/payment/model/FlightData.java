package payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flight2")
public class FlightData {

	@Id
	private int id;
	private int flight_id;
	private String departure_Time;
	private String arrival_Time;

	public FlightData() {
		super();
	}

	public FlightData(int id, int flight_id, String departure_Time, String arrival_Time) {
		super();
		this.id = id;
		this.flight_id = flight_id;
		this.departure_Time = departure_Time;
		this.arrival_Time = arrival_Time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getDeparture_Time() {
		return departure_Time;
	}

	public void setDeparture_Time(String departure_Time) {
		this.departure_Time = departure_Time;
	}

	public String getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

}
