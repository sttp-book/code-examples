package tudelft.domain;

public class Printer {

    public class WrongLengthException extends RuntimeException {
        public WrongLengthException() {
            super();
        }
    }

    public String compose(String firstName, String middleName, String lastName) {
        if (firstName == null || middleName == null || lastName == null)
            throw new IllegalArgumentException();

        if (wrongSize(1, 30, firstName)
                || wrongSize(0, 30, middleName)
                || wrongSize(0, 30, lastName))
            throw new WrongLengthException();

        String composed = firstName + compose(middleName, lastName);

        if (wrongSize(1, 70, composed)) throw new WrongLengthException();

        return composed;
    }

    public String compose(String middleName, String lastName) {
        String composed = "";
        if (middleName.length() > 0)
            composed += " " + middleName;
        if (lastName.length() > 0)
            composed += " " + lastName;
        return composed;
    }

    public boolean wrongSize(int min, int max, String string) {
        return string.length() < min || string.length() > max;
    }

}
