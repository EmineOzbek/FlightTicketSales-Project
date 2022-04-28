package flightTicketSalesProject.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.entity.Plane;
import flightTicketSalesProject.repository.PlaneRepository;

@Component
public class PlaneConverter {

//	Buradaki islemi ModelMapper kullanarak yaptim.
	@Autowired
	private PlaneRepository planeRepository;

	public Plane savePlane(PlaneSaveRequestDto planeSaveRequestDto) {

		int idRequestDto = planeSaveRequestDto.getId();
		String companyNameRequestDto = planeSaveRequestDto.getCompanyName();
		int passengerCountRequestDto = planeSaveRequestDto.getPassengerCount();
		int capacityRequestDto = planeSaveRequestDto.getCapacity();
		int fareRequestDto = planeSaveRequestDto.getFare();

		Plane plane = new Plane();

		plane.setId(idRequestDto);
		plane.setCompanyName(companyNameRequestDto);
		plane.setPassengerCount(passengerCountRequestDto);
		plane.setCapacity(capacityRequestDto);
		plane.setFare(fareRequestDto);

		plane = planeRepository.save(plane);
		return plane;

	}

}
