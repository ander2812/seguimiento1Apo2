package model;

import java.util.List;

import java.util.ArrayList;

import exception.DocNumberException;
import exception.TypeDocumentException;

import java.time.LocalDate;

public class Minimarket {

	int sum = 0;

	private List<Client> client;
	private List<Client> inClient;

	public String name;

	public Minimarket() {

		client = new ArrayList<>();
		inClient = new ArrayList<>();

		this.name = "Mi barrio te quiere";

	}

	public void addClient(String typeDocument, String docNumber) throws DocNumberException, TypeDocumentException {
		sum++;

		int day = LocalDate.now().getDayOfMonth();

		Client clients = new Client(typeDocument, docNumber);
		client.add(clients);

		if (clients.getTypeDocument().equalsIgnoreCase("TI")) {
			
			

		

			throw new TypeDocumentException(typeDocument);

		} else if (getNumDocument() % 2 == 0 && day % 2 == 0 || getNumDocument() % 2 != 0 && day % 2 != 0) {

			throw new DocNumberException(docNumber);

		} else if (getNumDocument() % 2 != 0 && day % 2 == 0 || getNumDocument() % 2 == 0 && day % 2 != 0) {

			inClient.add(clients);

		}

	}

	public int getNumDocument() {

		char num = 0;
		int numDoc;

		for (int i = 0; i < client.size(); i++) {

			num = client.get(i).getDocNumber().charAt(client.get(i).getDocNumber().length() - 2);

		}

		numDoc = Character.getNumericValue(num);

		return numDoc;

	}

	public List<Client> getClient() {

		return client;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

}
