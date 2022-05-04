package flightTicketSalesProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> methodNullPointerExceptionHandler(NullPointerException e) {
		
		return new ResponseEntity<>("Null data entered: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception e) {
		
		return new ResponseEntity<>("An exception has occurred: " + e.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
