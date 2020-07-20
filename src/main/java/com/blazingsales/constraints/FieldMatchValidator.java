package com.blazingsales.constraints;

import org.springframework.beans.BeanUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static org.apache.tomcat.util.IntrospectionUtils.getProperty;
import static org.springframework.beans.BeanUtils.*;


public class FieldMatchValidator implements ConstraintValidator< FieldMatch, Object > {

    private String firstFieldName;
    private String secondFieldName;

    public void initialize(final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }


    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        try {
            final Object firstObj = getProperty(value, firstFieldName);
            final Object secondObj = getProperty(value, secondFieldName);
            return firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
        } catch (final Exception ignore) {}
        return true;
    }

    /**
     * Debug: final Object firstObj = BeanUtils.getProperty(value, firstFieldName);
    * */
}
