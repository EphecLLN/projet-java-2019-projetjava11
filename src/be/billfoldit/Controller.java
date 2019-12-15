package be.billfoldit;

import be.billfoldit.model.*;

import java.util.*;

/**
 * Controller class, based on MVC model.
 * @author Melvin Campos Casares
 */
public class Controller {

    private List<Member> members = new ArrayList<>();
    private Map<Member, List<Spending>> spendingsByMembers = new HashMap<>();

    /**
     * Method which lists all current members
     * @return all the members stored
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     * Method which add a new member
     * @param member the new member that must be created
     */
    public void addMember(Member member) {
        members.add(member);
        spendingsByMembers.put(member, new ArrayList<>());
    }

    /**
     * Method which add a new spending
     * @param spending the spending the user wants to add
     * @param member the member on which the spendings must be added
     */
    public void addSpending(Spending spending, Member member) {
        List<Spending> spendings = spendingsByMembers.get(member);
        spendings.add(spending);
    }

    /**
     * Method which lists all current spendings
     * @param member the member on which we want to see the current spendings
     * @return all spendings of the specified member
     */
    public List<Spending> getSpendingsByUser(Member member) {
        List<Spending> spendings = spendingsByMembers.get(member);
        if (spendings == null) {
            return Collections.emptyList();
        } else {
            return spendings;
        }
    }

}
