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

//    public void initialize() {
//        System.out.println("Organization : initialize method called.");
//    }
//
//    public void destroy() {
//        System.out.println("Organization : destroy method called.");
//    }


    public void postConstruct() {
        System.out.println("Organization : postConstruct  method called.");
    }

    public void preDestroy() {
        System.out.println("Organization : preDestroy method called.");
    }
}
