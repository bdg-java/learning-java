package com.bdg.Json_Lesson.json.Validator;

import java.util.ArrayList;
import java.util.List;

public class ThumbnailJsonValidators implements JsonValidator {

    private final List <? extends JsonValidator> validators;

    public ThumbnailJsonValidators (final List<? extends JsonValidator>validators){
        this.validators =new ArrayList<>(validators);
    }

    @Override
    public boolean isValid(final  String jsonContent) {
        boolean isValid =true;
        for (final JsonValidator js: this.validators){
            if (!js.isValid(jsonContent)) {
                isValid =  false;
                break;
            }
        }
        return isValid;
    }
}
