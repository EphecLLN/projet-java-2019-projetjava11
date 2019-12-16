package be.billfoldit.views;

import be.billfoldit.Controller;
import be.billfoldit.TypeMember;
import be.billfoldit.model.Member;
import be.billfoldit.model.Spending;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * CLI view class.
 * 
 * @author Melvin Campos Casares
 */
public class ConsoleView extends BaseView {

	public ConsoleView(Controller controller) {
		super(controller);
	}

	@Override
	public void start() {
		while (true) {
			var commands = List.of("Select Member", "Add member", "Quit");
			var choice = Input.askChoice(commands);

			switch (choice) {
			case "Select Member":
				select();
				break;
			case "Add member":
				createMember();
				break;
			case "Quit":
				return;
			}
		}

	}

	/**
	 * Method that asks for selection in the CLI view menu
	 */
	private void select() {
		var names = controller.getMembers().stream().map(Member::displayName).collect(Collectors.toList());

		var name = Input.askChoice(names);

		var member = controller.getMembers().stream().filter(e -> e.displayName().equals(name)).findAny();

		if (member.isEmpty()) {
			throw new IllegalStateException();
		}

		System.out.println("Selected " + member.get().displayName());
		System.out.println();

		while (true) {
			var commands = List.of("Add Spending", "Add received amount", "Show spendings", "Show stats", "Go back");
			String choice = Input.askChoice(commands);

			switch (choice) {
			case "Show spendings":
				showSpendings(member.get());
				break;
			case "Add Spending":
				addSpending(member.get());
				break;
			case "Add received amount":
				addSalary(member.get());
				break;
			case "Show stats":
				showStats(member.get());
				break;
			case "Go back":
				return;
			}
		}
	}

	/**
	 * Method which asks for information in order to create a new member
	 */
	@Override
	public void createMember() {
		var f = Input.askforString("First name");
		var l = Input.askforString("Last name");

		if (f.isEmpty() || l.isEmpty()) {
			throw new IllegalStateException();
		}

		var roles = Arrays.stream(Member.TypeMember.values()).map(Enum::toString).collect(Collectors.toList());

		var role = Input.askChoice(roles);
		var roleEnum = Member.TypeMember.valueOf((String) role);

		var newMember = new Member(f.get(), l.get(), roleEnum);

		controller.addMember(newMember);

		System.out.println("Added " + newMember);
	}

	/**
	 * Method which list all current registered members
	 */
	@Override
	public void showMembers() {
		controller.getMembers().forEach(System.out::println);
	}

	/**
	 * Method which add a new spending for a member
	 */
	@Override
	public void addSpending(Member member) {
		addSpendingPosOrNeg(member, false);
	}

	/**
	 * Method which add a salary to a member The salary is an amount (Double) which
	 * is reproduced each month.
	 */
	@Override
	public void addSalary(Member member) {
		addSpendingPosOrNeg(member, true);
	}

	/**
	 * Method which add a positive or negative spending for a member
	 * 
	 * @param member the member to who the spending has to be added
	 * @param salary member has a salary or not
	 */
	private void addSpendingPosOrNeg(Member member, boolean salary) {
		var desc = Input.askforString("Description");
		var amount = Input.askForDouble("Amount");

		if (desc.isEmpty() || amount.isEmpty()) {
			throw new IllegalStateException();
		}

		double amountValue = amount.get();

		if (salary && amountValue < 0 || !salary && amountValue > 0) {
			amountValue = -amountValue;
		}

		var spending = new Spending(desc.get(), amountValue);

		controller.addSpending(spending, member);

		System.out.println("Added " + spending);
	}

	/**
	 * Method which list all current spendings of a member
	 */
	@Override
	public void showSpendings(Member member) {
		List<Spending> spendings = controller.getSpendingsByUser(member);
		if (spendings.isEmpty()) {
			System.out.println("No spendings for this user");
		} else {
			spendings.forEach(System.out::println);
		}
	}

	/**
	 * Method which list the total money received and the total money spent
	 */
	@Override
	public void showStats(Member member) {
		List<Spending> spendings = controller.getSpendingsByUser(member);

		if (spendings == null) {
			System.out.println("No data for this user");
			return;
		}

		Predicate<Spending> spendingPredicate = e -> e.getAmount() > 0;
		Predicate<Spending> salaryPredicate = e -> e.getAmount() <= 0;

		var spendingsList = spendings.stream().filter(spendingPredicate).collect(Collectors.toList());

		var salaryList = spendings.stream().filter(salaryPredicate).collect(Collectors.toList());

		var spendingSum = spendingsList.stream().mapToDouble(Spending::getAmount).sum();

		var salarySum = salaryList.stream().mapToDouble(Spending::getAmount).sum();

		System.out.println("Total received " + -salarySum);
		System.out.println("Total spent " + spendingSum);
		System.out.println();
	}

}
