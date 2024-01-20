package com.example.demo.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Bank;

public interface BankRepository extends JpaRepository<Bank, BigDecimal> {

}
