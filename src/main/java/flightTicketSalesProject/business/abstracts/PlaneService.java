package flightTicketSalesProject.business.abstracts;

import java.util.List;

import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PlaneResponseDto;

public interface PlaneService {

	Integer savePlane(PlaneSaveRequestDto planeSaveRequestDto);

	List<PlaneResponseDto> findAllPlanesById(Integer companyId);

	List<PlaneResponseDto> findAllPlanes();

	boolean deletePlaneById(Integer planeId);

}
