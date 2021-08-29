package ch14_2_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStoreage {
	private List<Product> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.��� | 2.��� | 3.����");
			System.out.println("------------------------");
			
			System.out.println("����: ");
			String selectNo = sc.nextLine();
			switch(selectNo) {
			case "1": registerProduct(); break;
			case "2": showProducts(); break;
			case "3": return;
			}
		}
	}
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("��ǰ��: ");
			product.setName(sc.nextLine());
			
			System.out.print("����: ");
			product.setPrice(Integer.parseInt(sc.nextLine()));
			
			System.out.print("���: ");
			product.setStock(Integer.parseInt(sc.nextLine()));
			
			list.add(product);
		} catch(Exception e) {
			System.out.println("��� ����: " + e.getMessage());
		}
	}
	public void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
