package flightTicketSalesProject.dto.requestDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaneSaveRequestDto {

	private int id;

	private int companyId;

	private String companyName;

	private int passengerCount;

	private int capacity;

	private int fare;
}
