package jsonparser.image;

import jsonparser.Validator;

import java.util.ArrayList;
import java.util.List;

public class ThumbnailValidator implements Validator {


    private final List<? extends Validator> validators;

    public ThumbnailValidator(final List<? extends Validator> validators) {
        this.validators = null;//new ArrayList<>(validators);
    }
//
//    @Override
//    public boolean isValid(final String jsonContent) {
//
//        boolean isValid = true;
//        System.out.println(validators);
//        for (final Validator js : this.validators) {
//            System.out.println("Aaa");
//            if (!js.isValid(jsonContent)) {
//                isValid =  false;
//                break;
//            }
//        }
//        return isValid;
//    }



    @Override
    public boolean isValid(String jsonContent) {

        for (int i = 0; i < jsonContent.length(); i++) {
            if (jsonContent.charAt(0) != '{' && (jsonContent.charAt(jsonContent.length() - 1)) != '}') {
                return false;
            }
        }
        return (jsonContent.indexOf("id") > 0
                && jsonContent.indexOf("type") > 0
                && jsonContent.indexOf("name") > 0
                && jsonContent.indexOf("image") > 0
                && jsonContent.indexOf("thumbnail") > 0

        );

    }
}
