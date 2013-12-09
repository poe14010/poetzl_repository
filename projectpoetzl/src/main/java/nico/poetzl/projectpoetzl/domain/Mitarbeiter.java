package nico.poetzl.projectpoetzl.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mitarbeiter")
public class Mitarbeiter extends BasisPerson{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "hire_date", nullable = false)
	private Date einstellungsdatum; 	
	
	@Size(max = 255)
    @NotNull
    @Column(name = "gehalt", nullable = false, length = 255)
	private float gehalt;
	
	
	protected Mitarbeiter() {
        // required for JPA
    }
	public Mitarbeiter(Date einstellungsdatum,float gehalt,Filiale filiale){
		this.einstellungsdatum=einstellungsdatum;
		this.gehalt=gehalt;
	}

	public Date getEinstellungsdatum() {
		return einstellungsdatum;
	}

	public void setEinstellungsdatum(Date einstellungsdatum) {
		this.einstellungsdatum = einstellungsdatum;
	}

	public float getGehalt() {
		return gehalt;
	}

	public void setGehalt(float gehalt) {
		this.gehalt = gehalt;
	}

	 

}

