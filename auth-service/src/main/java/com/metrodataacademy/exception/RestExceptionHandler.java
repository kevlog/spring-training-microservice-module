package com.metrodataacademy.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.metrodataacademy.domain.dto.response.ResTemplateDto;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler {

    // TODO : Add others exception handler
    @ExceptionHandler({ Exception.class })
    public ResponseEntity<ResTemplateDto> handleException(Exception exception) {
        ResTemplateDto message = new ResTemplateDto(null, exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ AuthorizationException.class })
    public ResponseEntity<ResTemplateDto> handleExeption(AuthorizationException exception) {
        ResTemplateDto message = new ResTemplateDto(null, exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    public ResponseEntity<ResTemplateDto> handleException(MethodArgumentNotValidException exception) {
        HashMap<String, List<String>> errorJson = new HashMap<>();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            String fieldName = error.getField();
            String errorMessage = error.getDefaultMessage();

            if (errorJson.containsKey(fieldName)) {
                errorJson.get(fieldName).add(errorMessage);
            } else {
                List<String> errors = new ArrayList<>();
                errors.add(errorMessage);
                errorJson.put(fieldName, errors);
            }
        });

        ResTemplateDto message = new ResTemplateDto(errorJson, "Validator error");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    protected ResponseEntity<Object> handleMethodNotAllowed(HttpRequestMethodNotSupportedException ex,
            WebRequest request) {
        String message = "Method Not Allowed: " + ex.getMethod();
        ResTemplateDto errorDetails = new ResTemplateDto(null, message);
        return new ResponseEntity<>(errorDetails, HttpStatus.METHOD_NOT_ALLOWED);
    }
}
