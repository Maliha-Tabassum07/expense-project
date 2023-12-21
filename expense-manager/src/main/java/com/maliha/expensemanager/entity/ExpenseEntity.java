package com.maliha.expensemanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExpenseEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private String expenseId;
   private String expenseCategory;
   private String expenseName;
   private LocalDate date;
   private String description;
   private Double amount;

}
