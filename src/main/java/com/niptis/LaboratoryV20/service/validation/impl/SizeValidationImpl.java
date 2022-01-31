package com.niptis.LaboratoryV20.service.validation.impl;

import com.niptis.LaboratoryV20.service.validation.SizeValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SizeValidationImpl implements SizeValidation {
    @Override
    public boolean sizeValidation(String validationString, int minSize, int maxSize) {
        StringBuilder stringBuilder = new StringBuilder("\\w{,}");
        stringBuilder.insert(3, minSize).insert(5, maxSize);
        Pattern pattern = Pattern.compile(stringBuilder.toString());
        Matcher matcher = pattern.matcher(validationString);
        return matcher.matches();
    }
}
