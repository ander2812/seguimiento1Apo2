package model;

import java.util.List;

import java.util.ArrayList;

import exception.DocNumberException;

import java.time.LocalDate;

public class Minimarket {

	

	private List<Client> client;

	public String name;
	
	

	public Minimarket() {

		client = new ArrayList<>();

		this.name = name;
		


	}

	public void addClient(String typeDocument, String docNumber) throws
	DocNumberException{
		
		int day= LocalDate.now().getDayOfMonth();
		
		if(getNumDocument()/2==0 & day/2==0 ) {
			
			throw new DocNumberException(docNumber);
			
			
			
			
		}
		
		Client clients = new Client(typeDocument, docNumber) ;
		
		client.add(clients);
		
	
			
			
	}

	public int getNumDocument() {

		char num = 0;

		for (int i = 0; i < client.size(); i++) {

			num = client.get(i).getDocNumber().charAt(client.get(i).getDocNumber().length() - 2);

		}

		String num2 = Character.toString(num);
		
		int numDoc = Integer.parseInt(num2);

		return numDoc;

	}
	
	public List<Client> getClient(){
		                               
		return client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
