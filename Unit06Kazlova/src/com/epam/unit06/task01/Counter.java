package com.epam.unit06.task01;

public class Counter {

	private int minValue;
	private int maxValue;

	private int value;

	public Counter() {
		minValue = 0;
		maxValue = 5;
		this.value = minValue;
	}

	public Counter(int minValue, int maxValue) {
		if (minValue >= maxValue) {
			throw new RuntimeException("Invalid parameters for counter");
		}

		this.minValue = minValue;
		this.maxValue = maxValue;

		this.value = minValue;
	}

	public int getValue() {

		return value;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void increase() {
		value++;
		if (value > maxValue) {
			value = maxValue;
		}
	}

	public void dicrease() {
		value--;
		if (value < minValue) {
			value = minValue;
		}
	}

}
