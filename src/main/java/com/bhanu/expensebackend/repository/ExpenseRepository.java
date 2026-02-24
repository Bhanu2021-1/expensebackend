package com.bhanu.expensebackend.repository;

import com.bhanu.expensebackend.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}