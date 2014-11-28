package com.apress.isf.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;

public class SearchEngineService {

	private DocumentDAO documentDAO;
	
	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}
	
	public void setDocumentDAO(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}
	
	public List<Document> findByType(Type documentType) {
		List<Document> result = new ArrayList<Document>();
		for(Document doc : listAll()){
			if(doc.getType().getName().equals(documentType.getName()))	
				result.add(doc);
		}
		return result;
	}
	
	public List<Document> listAll() {
		return Arrays.asList(documentDAO.getAll());
	}
}
