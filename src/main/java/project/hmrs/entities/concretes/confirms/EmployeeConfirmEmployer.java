package project.hmrs.entities.concretes.confirms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_confirm_employers")
@Data
public class EmployeeConfirmEmployer extends EmployeeConfirm {

	@Column(name="employer_id")
	private int employerId;
}
