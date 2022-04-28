package flightTicketSalesProject;

import java.util.Scanner;

import flightTicketSalesProject.business.concretes.CapacityManager;
import flightTicketSalesProject.business.concretes.InternationalFlightManager;
import flightTicketSalesProject.business.concretes.PassengerManager;
import flightTicketSalesProject.business.concretes.TicketManager;
import flightTicketSalesProject.entity.AnadoluJet;
import flightTicketSalesProject.entity.Pegasus;
import flightTicketSalesProject.entity.THY;

public class Main {

	public static void main(String[] args) {

		THY thy = new THY();
		thy.setFare(499);

		Pegasus pegasus = new Pegasus();
		pegasus.setFare(520);

		AnadoluJet anadoluJet = new AnadoluJet();
		anadoluJet.setFare(399);

		PassengerManager passengerManager = new PassengerManager();
		passengerManager.setThy(thy);
		passengerManager.setPegasus(pegasus);
		passengerManager.setAnadoluJet(anadoluJet);

		CapacityManager capacityManager = new CapacityManager();
		capacityManager.setThy(thy);
		capacityManager.setPegasus(pegasus);
		capacityManager.setAnadoluJet(anadoluJet);

		InternationalFlightManager internationalFlightManager = new InternationalFlightManager();
		TicketManager ticketManager = new TicketManager(passengerManager, capacityManager, internationalFlightManager);

		Scanner input = new Scanner(System.in);
		System.out.println(
				" Hosgeldiniz.\n Lutfen ucus yapmak istediginiz ucak firmasini secin: \n Thy: T, Pegasus: P, AnadoluJet: A ");
		String planeCompany = input.nextLine();

		if (planeCompany.equalsIgnoreCase("T")) {
			ticketManager.takeTicket(thy, 3);
		} else if (planeCompany.equalsIgnoreCase("P")) {
			ticketManager.takeTicket(pegasus, 1);
		} else if (planeCompany.equalsIgnoreCase("A")) {
			ticketManager.takeTicket(anadoluJet, 1);
		}

		passengerManager.isCurrentPassengerBusiness(thy);

		ticketManager.returnTicket(3);

		input.close();

	}

}
