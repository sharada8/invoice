package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cloths;
import com.example.demo.model.Vegitables;
import com.example.demo.repository.InvoiceRepo;
import com.example.demo.repository.Invoicerepo1;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepo repo;
	private Invoicerepo1 repo1;
	public List<Vegitables> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public List<Cloths> listAll1() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}


}
