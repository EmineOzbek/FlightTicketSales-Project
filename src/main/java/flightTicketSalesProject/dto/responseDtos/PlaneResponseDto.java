package flightTicketSalesProject.dto.responseDtos;

import lombok.Data;

@Data
public class PlaneResponseDto {

	private int id;
	private int companyId;
	private String companyName;
	private int passengerCount;
	private int capacity;
	private int fare;
	
}
