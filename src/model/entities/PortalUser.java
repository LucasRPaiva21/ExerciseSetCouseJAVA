package model.entities;

import java.util.Objects;

public class PortalUser {

	private Integer uniqueCode;
	
	public PortalUser(Integer uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public Integer getUniqueCode() {
		return uniqueCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniqueCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PortalUser other = (PortalUser) obj;
		return Objects.equals(uniqueCode, other.uniqueCode);
	}

}
