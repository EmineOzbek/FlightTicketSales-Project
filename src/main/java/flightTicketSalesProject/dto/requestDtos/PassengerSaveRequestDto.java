package flightTicketSalesProject.dto.requestDtos;

import lombok.Data;

@Data
public class PassengerSaveRequestDto {

	private int id;
	private String name;
	private int age;
	private int seatNo;

}
