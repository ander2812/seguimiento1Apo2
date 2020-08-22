package ui;

import java.util.Scanner;
import model.Minimarket;
import exception.DocNumberException;
import exception.TypeDocumentException;

public class Main {

	Minimarket miniMarket = new Minimarket();

	Scanner scan = new Scanner(System.in);

	public Main() {

		menu();

	}

	public static void main(final String args[]) {

		System.out.println("Programa minimarket ");

		new Main();

	}

	public void menu() {

		System.out.println(
				"(1) Registrar el ingreso de una nueva persona \n  (2) consultar la cantidad de personas que han intentado ingresar  \n (3) salir del programa ");
		int option = Integer.parseInt(scan.nextLine());

		switch (option) {

			case 1:

				System.out.println("por favor ingrese el tipo de documento como: TI, CC, CE, PP");
				String typeDocument = scan.nextLine();
				System.out.println(" ");
				System.out.println("por favor ingrese el numero de documento");
				String docNumber = scan.nextLine();

				try {
					miniMarket.addClient(typeDocument, docNumber);

				} catch (DocNumberException e) {
					System.out.println("el numero de documento no corresponde con el dia");

				} catch (TypeDocumentException td) {
					System.out.println("el tipo de documento no puede ingresar");
				}

				System.out.println(" ");

				menu();

				break;

			case 2:
				System.out.println("la cantidad de personas que han intentado ingresar son:" + miniMarket.getSum());

				break;

			case 3:
				scan.close();

				break;

		}
	}
}
