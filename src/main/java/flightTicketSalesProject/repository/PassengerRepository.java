package flightTicketSalesProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import flightTicketSalesProject.entity.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

}
