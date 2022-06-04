package flightTicketSalesProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flightTicketSalesProject.business.abstracts.PlaneService;
import flightTicketSalesProject.converter.PlaneConverter;
import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PlaneResponseDto;
import flightTicketSalesProject.entity.Plane;
import flightTicketSalesProject.repository.PlaneRepository;

@Service
public class PlaneManager implements PlaneService {

	@Autowired
	PlaneConverter planeConverter;
	@Autowired
	PlaneRepository planeRepository;
	@Autowired
	ModelMapper modelMapper;

//	***Buradaki islemi ModelMapper kullanarak asagida yaptim.***
//	@Override
//	public Integer savePlane(PlaneSaveRequestDto planeSaveRequestDto) {
//		Plane plane = planeConverter.savePlane(planeSaveRequestDto);
//		plane = planeRepository.save(plane);
//		return plane.getId();
//	}

	@Override
	public Integer savePlane(PlaneSaveRequestDto planeSaveRequestDto) {
		Plane plane = modelMapper.map(planeSaveRequestDto, Plane.class);
		plane = planeRepository.save(plane);
		return plane.getId();

	}

	@Override
	public List<PlaneResponseDto> findAllPlanesById(Integer companyId) {
		Plane planeCompanyId = planeRepository.findById(companyId).get();
		List<Plane> planeByIdList = planeRepository.findAllPlanesById(planeCompanyId);

		List<PlaneResponseDto> planeResponseDtos = new ArrayList<>();
		for (Plane plane : planeByIdList) {
			PlaneResponseDto planeResponseDto = modelMapper.map(plane, PlaneResponseDto.class);
			planeResponseDtos.add(planeResponseDto);
		}
		return planeResponseDtos;
	}

	@Override
	public List<PlaneResponseDto> findAllPlanes() {
		Iterable<Plane> planeList = planeRepository.findAll();

		List<PlaneResponseDto> planeResponseDtos = new ArrayList<>();
		for (Plane plane : planeList) {
			PlaneResponseDto planeResponseDto = modelMapper.map(plane, PlaneResponseDto.class);
			planeResponseDtos.add(planeResponseDto);
		}
		return planeResponseDtos;

	}

	@Override
	public boolean deletePlaneById(Integer planeId) {
		Plane plane = planeRepository.findById(planeId).get();
		planeRepository.delete(plane);
		return true;
	}

}
