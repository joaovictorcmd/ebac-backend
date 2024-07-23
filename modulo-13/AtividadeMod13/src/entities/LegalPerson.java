package entities;

import java.time.LocalDate;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 23
 */
public class LegalPerson extends Person {
    private String companyRegistrationNumber;

    public LegalPerson(String name, String email, String address, String phone, String companyRegistrationNumber) {
        super(name, email, address, phone);
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    @Override
    public String toString() {
        return "LegalPerson{" +
                "companyRegistrationNumber='" + companyRegistrationNumber + '\'' +
                '}';
    }
}
