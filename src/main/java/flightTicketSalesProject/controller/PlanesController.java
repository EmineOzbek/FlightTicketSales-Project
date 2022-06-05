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

import flightTicketSalesProject.business.abstracts.PlaneService;
import flightTicketSalesProject.dto.requestDtos.PlaneSaveRequestDto;
import flightTicketSalesProject.dto.responseDtos.PlaneResponseDto;

@RestController
@RequestMapping("/planes")
public class PlanesController {

	private PlaneService planeService;

	@Autowired
	public PlanesController(PlaneService planeService) {
		super();
		this.planeService = planeService;
	}

	@PostMapping("/savePlane")
	public ResponseEntity<Integer> savePlane(@RequestBody PlaneSaveRequestDto planeSaveRequestDto) {
		Integer planeId = planeService.savePlane(planeSaveRequestDto);
		return new ResponseEntity<>(planeId, HttpStatus.OK);
	}

	@GetMapping("/findAllPlanesById")
	public ResponseEntity<List<PlaneResponseDto>> findAllPlanesById(@RequestParam Integer companyId) {
		List<PlaneResponseDto> planesResponseDtoList = planeService.findAllPlanesById(companyId);
		return new ResponseEntity<>(planesResponseDtoList, HttpStatus.OK);
	}

	@GetMapping("/findAllPlanes")
	public ResponseEntity<List<PlaneResponseDto>> findAllPlanes() {
		List<PlaneResponseDto> planeResponseDtoList = planeService.findAllPlanes();
		return new ResponseEntity<>(planeResponseDtoList, HttpStatus.OK);
	}

	@DeleteMapping("/deletePlaneById")
	public ResponseEntity<Boolean> deletePlaneById(@RequestParam Integer planeId) {
		boolean delete = planeService.deletePlaneById(planeId);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}

}
