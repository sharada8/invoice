package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vegitables;

public interface InvoiceRepo extends JpaRepository<Vegitables, Integer> {

}
