package com.hamitmizrak.springboot_ecommerce.annotation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

// LOMBOK
@RequiredArgsConstructor

// ConstraintValidator
public class UniqueEmailAddressValidation implements ConstraintValidator<AnnotationUniqueEmailAddress,String> {

    // INJECTION
     private final com.hamitmizrak.springboot_ecommerce.data.repository.IRegisterRepository iRegisterRepository;

    @Override
    public void initialize(AnnotationUniqueEmailAddress constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    // DATABASE SORGUSU
    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext constraintValidatorContext) {
        Boolean isEmailAddress=iRegisterRepository.findByRegisterEmail(emailAddress).isPresent();
        //Eğer email address sistemde varsa
        if(isEmailAddress){
            return false;
        }
        return true; //email sistemde yoksa
    } //end isValid
} //end class
