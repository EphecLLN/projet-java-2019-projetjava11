package be.billfoldit.views;

import be.billfoldit.model.Member;

public interface View {
	void createMember();

	void addSalary(Member member);

	void addSpending(Member member);

	void showMembers();

	void showSpendings(Member member);

	void showStats(Member member);

	void start();
}
