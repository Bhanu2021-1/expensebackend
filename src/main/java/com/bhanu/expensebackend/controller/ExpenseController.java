package com.bhanu.expensebackend.controller;

import com.bhanu.expensebackend.entity.Expense;
import com.bhanu.expensebackend.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return repository.save(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }
}