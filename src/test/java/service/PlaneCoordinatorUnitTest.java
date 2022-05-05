package service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import flightTicketSalesProject.business.abstracts.PlaneService;
import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.entity.Plane;
import flightTicketSalesProject.repository.PlaneRepository;

@ExtendWith(MockitoExtension.class)
public class PlaneCoordinatorUnitTest {

	@InjectMocks
	PlaneService planeService;

	@Mock
	PlaneRepository planeRepository;

	@Test
	void saveThyTest() {
		PlaneSaveRequestDto planeSaveRequestDto = new PlaneSaveRequestDto();
		planeSaveRequestDto.setId(1);
		planeSaveRequestDto.setCompanyId(1);
		planeSaveRequestDto.setCompanyName("THY");
		planeSaveRequestDto.setPassengerCount(198);
		planeSaveRequestDto.setCapacity(200);
		planeSaveRequestDto.setFare(499);

		Plane planeMock = mock(Plane.class);
		when(planeRepository.planeSave(planeSaveRequestDto)).thenReturn(planeMock);
		Integer thySaveSuccess = planeService.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(1, thySaveSuccess);
	}

	@Test
	void savePegasusTest() {
		PlaneSaveRequestDto planeSaveRequestDto = new PlaneSaveRequestDto();
		planeSaveRequestDto.setId(2);
		planeSaveRequestDto.setCompanyId(2);
		planeSaveRequestDto.setCompanyName("Pegasus");
		planeSaveRequestDto.setPassengerCount(230);
		planeSaveRequestDto.setCapacity(250);
		planeSaveRequestDto.setFare(520);

		Plane planeMock = mock(Plane.class);
		when(planeRepository.planeSave(planeSaveRequestDto)).thenReturn(planeMock);
		Integer pegasusSaveSuccess = planeService.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(1, pegasusSaveSuccess);
	}

	@Test
	void saveAnadoluJetTest() {
		PlaneSaveRequestDto planeSaveRequestDto = new PlaneSaveRequestDto();
		planeSaveRequestDto.setId(3);
		planeSaveRequestDto.setCompanyId(3);
		planeSaveRequestDto.setCompanyName("Anadolu Jet");
		planeSaveRequestDto.setPassengerCount(150);
		planeSaveRequestDto.setCapacity(180);
		planeSaveRequestDto.setFare(399);

		Plane planeMock = mock(Plane.class);
		when(planeRepository.planeSave(planeSaveRequestDto)).thenReturn(planeMock);
		Integer anadoluJetSaveSuccess = planeService.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(1, anadoluJetSaveSuccess);
	}

}
