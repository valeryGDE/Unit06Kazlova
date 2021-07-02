package com.epam.unit06.task02;

public class App {

	public static void main(String[] args) {
//		Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
//		(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
//		Создать методы изменения времени на заданное количество часов, минут и секунд.

		Time time = new Time(3, 3, 3);
		System.out.println(time);
	
		time.add(3, 1, 1);
		System.out.println(time);
		
		Time time1 = new Time();
		time1.add(time);
		System.out.println(time1);
	}

}
