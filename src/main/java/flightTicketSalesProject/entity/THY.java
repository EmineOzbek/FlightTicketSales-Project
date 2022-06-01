package flightTicketSalesProject.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class THY extends Plane {

	@Override
	public int getCompanyId() {
		int companyId = 1;
		return companyId;
	}

	@Override
	public String getCompanyName() {
		String companyName = "THY";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 200;
		return capacity;
	}

}
