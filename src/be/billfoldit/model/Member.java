package be.billfoldit.model;

import be.billfoldit.TypeMember;

/**
 * Class which create a member with a role (see enum TypeMember), first and last name.
 * This class also show the complete name of the member.
 * @author Melvin Campos Casares
 */
public class Member {
    private String firstName;
    private String lastName;
    private TypeMember role;

    public Member(String firstName, String lastName, TypeMember role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    /**
     * Method to get the first name of the member
     * @return the first name of the member
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to set the first name of the member
     * @param firstName the first name of the member
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method to get the last name of the member
     * @return the last name of the member
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to set the last name of the member
     * @param lastName the last name of the member
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method to get the role of the member
     * @return the role (see enum TypeMember) of the member
     */
    public TypeMember getRole() {
        return role;
    }

    /**
     * Method to set the role of the member
     * @param role the role (see enum TypeMember) of the member
     */
    public void setRole(TypeMember role) {
        this.role = role;
    }

    /**
     * Method to display the complete name of the member
     * @return the first and last name of the member
     */
    public String displayName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (!firstName.equals(member.firstName)) return false;
        if (!lastName.equals(member.lastName)) return false;
        return role == member.role;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }

}
