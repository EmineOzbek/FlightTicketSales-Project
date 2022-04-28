package flightTicketSalesProject.dto.requestDtos;

import lombok.Data;

@Data
public class PlaneSaveRequestDto {

	private int id;

	private int companyId;

	private String companyName;

	private int passengerCount;

	private int capacity;

	private int fare;
}
