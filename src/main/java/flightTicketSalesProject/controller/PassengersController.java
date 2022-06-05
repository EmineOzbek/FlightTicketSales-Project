package flightTicketSalesProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flightTicketSalesProject.business.abstracts.PassengerService;
import flightTicketSalesProject.dto.requestDtos.PassengerSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PassengerResponseDto;

@RestController
@RequestMapping("/passengers")
public class PassengersController {

	private PassengerService passengerService;
	
	@Autowired
	public PassengersController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}

	@PostMapping("/savePassenger")
	public ResponseEntity<Integer> savePassenger(@RequestBody PassengerSaveRequestDto passengerSaveRequestDto) {
		Integer customerId = passengerService.savePassenger(passengerSaveRequestDto);
		return new ResponseEntity<>(customerId, HttpStatus.OK);
	}

	@GetMapping("/findAllPassengersById")
	public ResponseEntity<List<PassengerResponseDto>> findAllPassengers() {
		List<PassengerResponseDto> passengersResponseDtoList = passengerService.findAllPassengers();
		return new ResponseEntity<>(passengersResponseDtoList, HttpStatus.OK);
	}

	@DeleteMapping("/deletePassengerById")
	public ResponseEntity<Boolean> deletePassengerById(@RequestParam Integer passengerId) {
		boolean delete = passengerService.deletePassengerById(passengerId);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}

}
