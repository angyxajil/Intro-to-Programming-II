package realFinal;

public abstract class Ingredient { // make abstract class

	private double costPerMA = 0.0; // must be positive, set default to 0.0
	private double amountUsed;
	private String measurements; // Cup, Teaspoon, Ounce, etc

	public Ingredient(double amount, String measureType) {

		amountUsed = amount;
		measurements = measureType;
	}

	public double getCostPerMA() {
		return costPerMA;
	}

	public void setCostPerMA(double costPerMA) {
		this.costPerMA = costPerMA;
	}

	public double getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(double amountUsed) {
		this.amountUsed = amountUsed;
	}

	public String getMeasurements() {
		return measurements;
	}

	public void setMeasurements(String measurements) {
		this.measurements = measurements;
	}

	@Override
	public abstract String toString();

}
