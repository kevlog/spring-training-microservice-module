package com.metrodataacademy.domain.dto.customvalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ThreadsFilterByValidator implements ConstraintValidator<ValidThreadsFilterBy, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.equalsIgnoreCase("title") || value.equalsIgnoreCase("totalComments")
                || value.equalsIgnoreCase("totalViews") || value.equalsIgnoreCase("")) {
            return true;
        }
        return false;
    }
}
