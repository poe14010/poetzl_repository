package nico.poetzl.projectpoetzl.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class BasisPerson extends BasisKlasse implements Serializable {
	
	private static final long serialVersionUID = 4209931258096103397L;

	  	@Size(max = 255)
	    @NotNull
	    @Column(name = "name", nullable = false, length = 255)
	    private String name;

	    @Temporal(TemporalType.DATE)
	    @NotNull
	    @Column(name = "birth_date", nullable = false)
	    private Date birthDate;

	public String getname() {
		return this.name;
	}
	public Date getbirthDate() {
		return this.birthDate;
	}

	@Override
	public int hashCode() {
		return (getId() != null) ? getId().hashCode() : System
				.identityHashCode(this);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this) {
			return true;
		}
		if (!this.getClass().equals(o.getClass())) {
			return false;
		}
		BasisPerson other = (BasisPerson) o;
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		}
		return this.getId().equals(other.getId());
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[Id=" + getId() + "]";
	}
}

