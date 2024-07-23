package entities;

import entities.enums.Gender;

import java.time.LocalDate;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 23
 */
public class NaturalPerson extends Person {
    private String identityCard;
    private Gender gender;
    private String maritalStatus;

    public NaturalPerson(String name, String email, String address, String phone, String identityCard, Gender gender, String maritalStatus) {
        super(name, email, address, phone);
        this.identityCard = identityCard;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "NaturalPerson{" +
                "identityCard='" + identityCard + '\'' +
                ", gender=" + gender +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
