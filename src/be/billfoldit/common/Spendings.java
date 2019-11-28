package be.billfoldit.common;

import java.time.LocalDate;

public class Spendings {
	private SpendingsCategory category;
	private String description;
	private double value;
	private LocalDate spendingDate;
	
	public Spendings(SpendingsCategory category, String description, double value, LocalDate spendingDate) {
		this.category = category;
		this.description = description;
		this.value = value;
		this.spendingDate = spendingDate;
	}

	public SpendingsCategory getCategory() {
		return category;
	}

	public void setCategory(SpendingsCategory category) {
		this.category = category;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public LocalDate getSpendingDate() {
		return spendingDate;
	}

	public void setSpendingDate(LocalDate spendingDate) {
		this.spendingDate = spendingDate;
	}
	
}
