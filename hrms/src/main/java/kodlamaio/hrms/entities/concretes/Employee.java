package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor

public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	private int userId;
	@Column(name="confirmation")
	private String Confirmation;
	@Column(name="departmanid")
	private String departmanId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	

}
