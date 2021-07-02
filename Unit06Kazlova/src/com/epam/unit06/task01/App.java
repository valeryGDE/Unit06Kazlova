package com.epam.unit06.task01;

public class App {

	public static void main(String[] args) {
//		Опишите класс, реализующий счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
//		Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
//		Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
//		Написать код, демонстрирующий все возможности класса.

		Counter counter1 = new Counter(1, 5);
		System.out.println("counter1 value = " + counter1.getValue());

		counter1.increase();
		System.out.println("counter1 value = " + counter1.getValue());

		counter1.increase();
		System.out.println("counter1 value = " + counter1.getValue());

		counter1.increase();
		System.out.println("counter1 value = " + counter1.getValue());

		Counter counter2 = new Counter();
		System.out.println("counter2 value = " + counter2.getValue());

		counter2.increase();
		System.out.println("counter2 value = " + counter2.getValue());

		counter2.dicrease();
		System.out.println("counter2 value = " + counter2.getValue());

		counter2.dicrease();
		System.out.println("counter2 value = " + counter2.getValue());
	}

}
