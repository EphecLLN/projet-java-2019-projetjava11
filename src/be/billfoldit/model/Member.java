package be.billfoldit.model;

import be.billfoldit.TypeMember;

public class Member {
    private String firstName;
    private String lastName;
    private TypeMember role;

    public Member(String firstName, String lastName, TypeMember role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TypeMember getRole() {
        return role;
    }

    public void setRole(TypeMember role) {
        this.role = role;
    }

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
