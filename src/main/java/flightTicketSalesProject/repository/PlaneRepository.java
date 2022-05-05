package flightTicketSalesProject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.entity.Plane;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, Integer> {

	List<Plane> findAllPlanesById(Plane plane);
	
	Plane planeSave(PlaneSaveRequestDto planeSaveRequestDto);
}
