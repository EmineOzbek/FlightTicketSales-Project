package flightTicketSalesProject.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class AnadoluJet extends Plane {

	@Override
	public int getCompanyId() {
		int companyId = 3;
		return companyId;
	}

	@Override
	public String getCompanyName() {
		String companyName = "Andolu Jet";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 180;
		return capacity;
	}
}
