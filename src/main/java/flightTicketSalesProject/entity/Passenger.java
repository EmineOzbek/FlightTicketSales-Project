package flightTicketSalesProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessengers")
public class Passenger {

	@Id
	@GeneratedValue
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private int age;

	@Column(name = "seat_no")
	private int seatNo;

}
