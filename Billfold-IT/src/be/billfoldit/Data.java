package be.billfoldit;

public class Data {
	private Bonjour bonjour;
	private double moneyAmount;

	public Data(Bonjour bonjour, double moneyAmount) {
		this.bonjour = bonjour;
		this.moneyAmount = moneyAmount;
	}

	public Bonjour getBonjour() {
		return bonjour;
	}

	public double getMoneyAmount() {
		return moneyAmount;
	}

	@Override
	public String toString() {
		return "Data [bonjour=" + bonjour + ", moneyAmount=" + moneyAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonjour == null) ? 0 : bonjour.hashCode());
		long temp;
		temp = Double.doubleToLongBits(moneyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (bonjour != other.bonjour)
			return false;
		if (Double.doubleToLongBits(moneyAmount) != Double.doubleToLongBits(other.moneyAmount))
			return false;
		return true;
	}

}
