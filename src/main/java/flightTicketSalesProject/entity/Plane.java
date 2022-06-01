package flightTicketSalesProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "planes")
public class Plane {

	@Id
	@GeneratedValue
	@Column
	private int id;

	@Column(name = "company_id")
	private int companyId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "passenger_count")
	private int passengerCount;

	@Column
	private int capacity;

	@Column
	private int fare;

	@ManyToOne
	@JoinColumn(name = "passenger_id")
	private Passenger passenger;

}
