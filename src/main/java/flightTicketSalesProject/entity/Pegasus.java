package flightTicketSalesProject.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Pegasus extends Plane {

	@Override
	public int getCompanyId() {
		int companyId = 2;
		return companyId;
	}

	@Override
	public String getCompanyName() {
		String companyName = "Pegasus";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 250;
		return capacity;
	}

}
