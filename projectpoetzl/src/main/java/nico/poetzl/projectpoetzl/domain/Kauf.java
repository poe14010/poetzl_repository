package nico.poetzl.projectpoetzl.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
public class Kauf extends BasisKlasse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float preis;
	private float provision;
	
	@Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "buying_date", nullable = false)
    private Date kaufdat;
	
	
	private Kunde kunde;
	private Auto auto;
	private Mitarbeiter mitarbeiter;
	
	public Kauf(int kaufnr,float preis,float provision,Date kaufdat,Kunde kunde,Auto auto,Mitarbeiter mitarbeiter){
		this.preis=preis;
		this.provision=provision;
		this.kaufdat=kaufdat;
		this.kunde = kunde;
		this.auto=auto;
		this.mitarbeiter=mitarbeiter;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public float getProvision() {
		return provision;
	}

	public void setProvision(float provision) {
		this.provision = provision;
	}

	

	public Date getKaufdat() {
		return kaufdat;
	}

	public void setKaufdat(Date kaufdat) {
		this.kaufdat = kaufdat;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Mitarbeiter getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}
	
}
