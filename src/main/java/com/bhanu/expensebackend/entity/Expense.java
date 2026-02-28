package com.bhanu.expensebackend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String note;
    private String category;

    private LocalDateTime date;   // 🔥 ADD THIS

    @PrePersist
    public void setDate() {
        this.date = LocalDateTime.now();
    }

    // getters & setters
}