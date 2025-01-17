package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.DocNumberException;
import exception.TypeDocumentException;

class MinimarketTest {
	private Minimarket miniMarket;
	
	public void setupScenary1() {
		
		miniMarket = new Minimarket();
	}

	@Test
	void testaddClient_1() {
		setupScenary1();
		String typeDocument= "cc";
		String docNumber= "123456";
		try {
			miniMarket.addClient(typeDocument, docNumber);
			
			assertEquals(1,miniMarket.getClient().size());
			assertEquals(docNumber,miniMarket.getClient().get(0).getDocNumber());
		} catch (DocNumberException e) {
			fail("DocNumberException isn't expected here");
			
			
			
			
			assertEquals(1,miniMarket.getClient().size());
			assertEquals(typeDocument,miniMarket.getClient().get(0).getTypeDocument());
		} catch (TypeDocumentException td) {
			fail("TypeDocumentException isn't expected here");
			
		}
	}
	
	@Test
	void testaddClient_2() {
		setupScenary1();
		String typeDocument= "TI";
		String docNumber= "123456";
		
		try {
			miniMarket.addClient(typeDocument, docNumber);
			
			assertEquals(1,miniMarket.getClient().size());
			assertEquals(docNumber,miniMarket.getClient().get(0).getDocNumber());
		} catch (DocNumberException e) {
			fail("DocNumberException isn't expected here");
			
			assertEquals(1,miniMarket.getClient().size());
			assertEquals(typeDocument,miniMarket.getClient().get(0).getTypeDocument());
		} catch (TypeDocumentException e) {
			fail("TypeDocumentException is expected here is a TI can not enter");
			
			
		}
		
	}
	
	@Test
	void testaddClient_3() {
		setupScenary1();
		String typeDocument= "cc";
		String docNumber= "123487";
		
			try {
				miniMarket.addClient(typeDocument, docNumber);
				
				assertEquals(1,miniMarket.getClient().size());
				assertEquals(docNumber,miniMarket.getClient().get(0).getDocNumber());
			} catch (DocNumberException e) {
				fail("DocNumberEcxeption is expected here it does not correspond to leave on that date" );
				
				assertEquals(1,miniMarket.getClient().size());
				assertEquals(typeDocument,miniMarket.getClient().get(0).getTypeDocument());
			} catch (TypeDocumentException e) {
				fail("TypeDocumentException isn't expected here ");
				
				
			}
			
	}
	
	

}
