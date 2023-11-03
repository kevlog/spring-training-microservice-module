package com.metrodataacademy.domain.dto.customvalidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ImageContentTypeValidator.class)
public @interface ValidImageContentType {
    String message() default "Invalid content type must be image";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
