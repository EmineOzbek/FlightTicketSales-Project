package flightTicketSalesProject.business.concretes;

import org.springframework.stereotype.Service;

import flightTicketSalesProject.business.abstracts.CapacityService;
import flightTicketSalesProject.entity.AnadoluJet;
import flightTicketSalesProject.entity.Pegasus;
import flightTicketSalesProject.entity.THY;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class CapacityManager implements CapacityService {

	private THY thy;
	private Pegasus pegasus;
	private AnadoluJet anadoluJet;

}
