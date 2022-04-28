package flightTicketSalesProject.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import flightTicketSalesProject.dto.requestDtos.PassengerSaveRequestDto;
import flightTicketSalesProject.entity.Passenger;
import flightTicketSalesProject.repository.PassengerRepository;

@Component
public class PassengerConverter {

//	Buradaki islemi ModelMapper kullanarak yaptim.
	@Autowired
	private PassengerRepository passengerRepository;

	public Passenger savePassenger(PassengerSaveRequestDto passengerSaveRequestDto) {

		int idRequestDto = passengerSaveRequestDto.getId();
		String nameRequestDto = passengerSaveRequestDto.getName();
		int ageRequestDto = passengerSaveRequestDto.getAge();
		int seatNoRequestDto = passengerSaveRequestDto.getSeatNo();

		Passenger passenger = new Passenger();

		passenger.setId(idRequestDto);
		passenger.setName(nameRequestDto);
		passenger.setAge(ageRequestDto);
		passenger.setSeatNo(seatNoRequestDto);

		passenger = passengerRepository.save(passenger);
		return passenger;

	}
}
