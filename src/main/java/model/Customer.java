package model;

import java.util.Date;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Customer {
	
	private static final long serialVersionUID = 1099189656054852009L;
	
	@Column(length = 11)
	private String cpf;
	
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private String email;
	
	//@Enumerated(EnumType.STRING)
	//private MaritalStatus maritalStatus;
	
	private boolean livesWithTheRiskRange;
	
	//@Embedded
	//private DrivingLicense drivingLicense;

}
