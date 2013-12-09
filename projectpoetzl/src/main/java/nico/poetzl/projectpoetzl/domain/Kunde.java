package nico.poetzl.projectpoetzl.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Kunde extends BasisPerson{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(max = 255)
    @NotNull
    @Column(name = "boughtcars", nullable = false, length = 255)
	private int gekAutos;
	
	@Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "customersince_date", nullable = false)
    private Date kundeseit;
	
	public Kunde(int gekAutos,Date kundeseit){
		this.gekAutos=gekAutos;
		this.kundeseit=kundeseit;
	}


	public int getGekAutos() {
		return gekAutos;
	}

	public void setGekAutos(int gekAutos) {
		this.gekAutos = gekAutos;
	}

	public Date getKundeseit() {
		return kundeseit;
	}

	public void setKundeseit(Date kundeseit) {
		this.kundeseit = kundeseit;
	}

}

