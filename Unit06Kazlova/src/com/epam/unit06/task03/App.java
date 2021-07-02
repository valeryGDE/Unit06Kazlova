package com.epam.unit06.task03;

public class App {

	public static void main(String[] args) {
//		Данное задание вам может показаться тяжелым и вы не сразу будете знать как его решить, или как правильно решить. 
//		В этой задаче главное воспользоваться всеми уже полученными знаниями и решить как получается.
//		Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы. 
//		Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
//		Задать критерии выбора данных и вывести эти данные на консоль.
//		Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//		Найти и вывести:
//		a) список книг заданного автора;
//		b) список книг, выпущенных после заданного года.

		Book book1 = new Book(1, "#1 book", "Alex", "Cool publishing house", 2001, 100, 100.0, "Hardcover");
		Book book2 = new Book(2, "#2 book", "John", "Bad publishing house", 2002, 200, 200.0, "Softcover");
		Book book3 = new Book(3, "#3 book", "John", "Bad publishing house", 2003, 300, 300.0, "Hardcover");
		Book book4 = new Book(4, "#4 book", "Alex", "Cool publishing house", 2004, 250, 50.0, "Hardcover");

		Library firstLibrary = new Library();
		
		firstLibrary.add(book1);
		firstLibrary.add(book2);
		firstLibrary.add(book3);
		firstLibrary.add(book4);
		
		System.out.println(firstLibrary.findByAuthor("Alex"));
		
		System.out.println(firstLibrary.findByAfterXYearOfPublishing(2003));
	}

}
