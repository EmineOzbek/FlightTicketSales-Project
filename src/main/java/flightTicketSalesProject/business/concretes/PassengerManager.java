package flightTicketSalesProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flightTicketSalesProject.business.abstracts.PassengerService;
import flightTicketSalesProject.converter.PassengerConverter;
import flightTicketSalesProject.dto.requestDtos.PassengerSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PassengerResponseDto;
import flightTicketSalesProject.entity.AnadoluJet;
import flightTicketSalesProject.entity.Passenger;
import flightTicketSalesProject.entity.Pegasus;
import flightTicketSalesProject.entity.Plane;
import flightTicketSalesProject.entity.THY;
import flightTicketSalesProject.repository.PassengerRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PassengerManager implements PassengerService {

	private THY thy;
	private Pegasus pegasus;
	private AnadoluJet anadoluJet;

	@Override
	public boolean isCurrentPassengerBusiness(Plane plane) {
		if (plane.equals(thy) || plane.equals(pegasus))
			return true;
		else if (plane.equals(anadoluJet))
			return false;

		return false;
	}

	@Autowired
	private PassengerConverter passengerConverter;
	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Integer savePassenger(PassengerSaveRequestDto passengerSaveRequestDto) {
		Passenger passenger = modelMapper.map(passengerSaveRequestDto, Passenger.class);
		passenger = passengerRepository.save(passenger);
		return passenger.getId();
	}

	@Override
	public List<PassengerResponseDto> findAllPassengers() {
		Iterable<Passenger> passengerList = passengerRepository.findAll();

		List<PassengerResponseDto> passengerResponseDtos = new ArrayList<>();
		for (Passenger passenger : passengerList) {
			PassengerResponseDto passengerResponseDto = modelMapper.map(passenger, PassengerResponseDto.class);
			passengerResponseDtos.add(passengerResponseDto);
		}
		return passengerResponseDtos;
	}

	@Override
	public boolean deletePassengerById(Integer passengerId) {
		Passenger passenger = passengerRepository.findById(passengerId).get();
		passengerRepository.delete(passenger);
		return true;
	}

}
