package be.billfoldit.model;

public class Spending {
    private String description;
    private double amount;

    public Spending(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

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
