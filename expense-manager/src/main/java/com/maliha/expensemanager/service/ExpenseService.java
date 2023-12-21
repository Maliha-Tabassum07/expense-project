package com.maliha.expensemanager.service;

import com.maliha.expensemanager.dto.requestDto.ExpenseRequestDto;
import com.maliha.expensemanager.repository.ExpenseRepository;

public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    public String createExpense(ExpenseRequestDto requestDto){
        return null;
    }
}
