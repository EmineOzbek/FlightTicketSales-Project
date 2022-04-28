package flightTicketSalesProject.business.abstracts;

import flightTicketSalesProject.entity.Plane;

public interface TicketService {

	void takeTicket(Plane plane, int passengerCount);

	void returnTicket(int ticketDay);

}
