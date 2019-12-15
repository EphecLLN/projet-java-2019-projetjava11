package be.billfoldit.model;

/**
 * Class which create a spending based on a description and an amount.
 * The amount can be a round or unround value.
 * @author Melvin Campos Casares
 */
public class Spending {
    private String description;
    private double amount;

    public Spending(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    /**
     * Method to get the description of the spending
     * @return the description of the spending
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metho to set a description on a spending
     * @param description the description that will be set on the spending
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method to get the amount of the spending
     * @return the amount of the spending
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Method to an amount on a spending
     * @param amount the amount that will be set on a spending
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spending spending = (Spending) o;

        if (Double.compare(spending.amount, amount) != 0) return false;
        return description != null ? description.equals(spending.description) : spending.description == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = description != null ? description.hashCode() : 0;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        var type = amount >= 0 ? "Received amount" : "Depense";

        return type + "{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
