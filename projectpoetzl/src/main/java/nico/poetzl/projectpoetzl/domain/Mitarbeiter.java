package nico.poetzl.projectpoetzl.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mitarbeiter")
public class Mitarbeiter extends BasisPerson{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	    @NotNull
	    @Column(name = "birth_date", nullable = false)
	private Date einstellungsdatum;
	 	
	private float gehalt;
	private Filiale filiale;
	
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

	public Filiale getFiliale() {
		return filiale;
	}

	public void setFiliale(Filiale filiale) {
		this.filiale = filiale;
	}

}

