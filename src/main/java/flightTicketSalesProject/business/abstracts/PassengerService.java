package flightTicketSalesProject.business.abstracts;

import java.util.List;

import flightTicketSalesProject.dto.requestDtos.PassengerSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PassengerResponseDto;
import flightTicketSalesProject.entity.Plane;

public interface PassengerService {

	boolean isCurrentPassengerBusiness(Plane plane);

	Integer savePassenger(PassengerSaveRequestDto passengerSaveRequestDto);

	List<PassengerResponseDto> findAllPassengers();

	boolean deletePassengerById(Integer passengerId);

}
