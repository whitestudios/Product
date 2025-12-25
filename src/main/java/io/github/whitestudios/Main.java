package io.github.whitestudios;

import io.github.whitestudios.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        String name;
        int quantity;
        double price;
        Product product;
        int prods_added, prods_removed;

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Price: ");
        price = sc.nextDouble();

        sc.nextLine();
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        sc.nextLine();

        product = new Product(name, price, quantity);

        System.out.println(" ");
        System.out.println("Product data: " + product);
        System.out.println(" ");

        System.out.print("Enter the number of products to be added in stock: ");
        prods_added = sc.nextInt();
        sc.nextLine();

        product.AddProducts(prods_added);

        System.out.println(" ");
        System.out.println(" Updated data: " + product);
        System.out.println(" ");

        System.out.print("Enter the number of products to be removed from stock: ");
        prods_removed = sc.nextInt();
        sc.nextLine();

        product.RemoveProducts(prods_removed);
        System.out.println("  ");

        System.out.println("Updated data: " + product);
        System.out.println(" ");

        System.out.println("Bye...");
    }
}
