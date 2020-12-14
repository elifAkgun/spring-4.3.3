package code.elif.model;

import code.elif.service.BusinessService;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class Organization {

	@NonNull
	private String companyName;
	@NonNull
	private Integer yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	 
}
