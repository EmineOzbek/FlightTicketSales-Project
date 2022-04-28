package flightTicketSalesProject.business.concretes;

import org.springframework.stereotype.Service;

import flightTicketSalesProject.business.abstracts.InternationalFlightService;
import flightTicketSalesProject.entity.Plane;

@Service
public class InternationalFlightManager implements InternationalFlightService {

	@Override
	public void foodChoice(Plane plane) {
		System.out.println(plane.getCompanyName() + " yurtdisi ucuslarinda yemek ikraminda bulunur.");
	}

}
