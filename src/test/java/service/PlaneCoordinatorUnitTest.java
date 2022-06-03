package service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import flightTicketSalesProject.business.concretes.PlaneManager;
import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.entity.Plane;
import flightTicketSalesProject.repository.PlaneRepository;

@ExtendWith(MockitoExtension.class)
public class PlaneCoordinatorUnitTest {

	@InjectMocks
	PlaneManager planeManager;

	@Mock
	PlaneRepository planeRepository;
	
	@Mock
	ModelMapper modelMapper;

	@Test
	void saveThyTest() {
		PlaneSaveRequestDto planeSaveRequestDto = mock(PlaneSaveRequestDto.class);
		planeSaveRequestDto.setId(1);
		planeSaveRequestDto.setCompanyId(1);
		planeSaveRequestDto.setCompanyName("THY");
		planeSaveRequestDto.setPassengerCount(198);
		planeSaveRequestDto.setCapacity(200);
		planeSaveRequestDto.setFare(499);

		Plane planeMock = mock(Plane.class);
		when(modelMapper.map(planeSaveRequestDto, Plane.class)).thenReturn(planeMock);
		when(planeRepository.save(planeMock)).thenReturn(planeMock);
		Integer thySaveSuccess = planeManager.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(0, thySaveSuccess);
	}

	@Test
	void savePegasusTest() {
		PlaneSaveRequestDto planeSaveRequestDto = mock(PlaneSaveRequestDto.class);
		planeSaveRequestDto.setId(2);
		planeSaveRequestDto.setCompanyId(2);
		planeSaveRequestDto.setCompanyName("Pegasus");
		planeSaveRequestDto.setPassengerCount(230);
		planeSaveRequestDto.setCapacity(250);
		planeSaveRequestDto.setFare(520);

		Plane planeMock = mock(Plane.class);
		when(modelMapper.map(planeSaveRequestDto, Plane.class)).thenReturn(planeMock);
		when(planeRepository.save(planeMock)).thenReturn(planeMock);
		Integer pegasusSaveSuccess = planeManager.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(0, pegasusSaveSuccess);
	}

	@Test
	void saveAnadoluJetTest() {
		PlaneSaveRequestDto planeSaveRequestDto = mock(PlaneSaveRequestDto.class);
		planeSaveRequestDto.setId(3);
		planeSaveRequestDto.setCompanyId(3);
		planeSaveRequestDto.setCompanyName("Anadolu Jet");
		planeSaveRequestDto.setPassengerCount(150);
		planeSaveRequestDto.setCapacity(180);
		planeSaveRequestDto.setFare(399);

		Plane planeMock = mock(Plane.class);
		when(modelMapper.map(planeSaveRequestDto, Plane.class)).thenReturn(planeMock);
		when(planeRepository.save(planeMock)).thenReturn(planeMock);
		Integer anadoluJetSaveSuccess = planeManager.savePlane(planeSaveRequestDto);
		Assertions.assertEquals(0, anadoluJetSaveSuccess);
	}

}
