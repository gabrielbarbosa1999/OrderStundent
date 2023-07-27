package dev.gabrielbarbosa.OrderStudent;

import dev.gabrielbarbosa.OrderStudent.entities.Order;
import dev.gabrielbarbosa.OrderStudent.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderStudentApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderStudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Entrada 1
		Order orderOne = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código " + orderOne.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(orderOne));

		System.out.println();

		//Entrada 2
		Order orderTwo = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código " + orderTwo.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(orderTwo));

		System.out.println();

		//Entrada 3
		Order orderThree = new Order(1309, 95.90, 0);
		System.out.println("Pedido código " + orderThree.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(orderThree));

	}

}
