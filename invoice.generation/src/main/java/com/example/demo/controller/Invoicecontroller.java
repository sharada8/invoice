package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Vegitables;
import com.example.demo.service.InvoiceService;

@Controller
@RequestMapping("/invoice")
public class Invoicecontroller<Cloths> {
	@Autowired
	private InvoiceService service;
	@GetMapping("/")
	public String invoice(Model model) {
		List<Vegitables> listveg =service.listAll();
		model.addAttribute("listveg", listveg);
		System.out.println("Get/");
		return "invoice.html";
	}
	@RequestMapping("/invoice1")
	public String invoice1(Model model) {
		List<Vegitables> listveg =service.listAll();
		model.addAttribute("listveg", listveg);
		System.out.println("Get/");
		return "invoiceresponce.html";
	}
	
	@RequestMapping("/invoice2")
	public String invoice2(Model model) {
		List<Cloths> listcloths =(List<Cloths>) service.listAll();
		model.addAttribute("listcl", listcloths);
		System.out.println("Get/");
		return "invoiceresponce1.html";
	}

}
