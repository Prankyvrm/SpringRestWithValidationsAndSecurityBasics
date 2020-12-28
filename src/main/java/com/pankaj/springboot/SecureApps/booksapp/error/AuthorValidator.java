package com.pankaj.springboot.SecureApps.booksapp.error;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author,String> {
    private List<String> validAuthors= Arrays.asList("Pankaj","Priya","Sheetal","Sumit");



    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return validAuthors.contains(s);
    }
}
