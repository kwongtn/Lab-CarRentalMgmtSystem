package controller.validator;

public class Validator {
    public static String validate(String field, String value, boolean required, int length)
            throws RequiredFieldException, MaximumLengthException {
        if (required && (value == null || value.trim().isEmpty())) {
            throw new RequiredFieldException(field);
        }

        value = value.trim();

        if (value.length() > length) {
            throw new MaximumLengthException(field, length);
        }

        return value;
    }
}