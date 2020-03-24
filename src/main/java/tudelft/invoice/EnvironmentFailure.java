package tudelft.invoice;

/*
  Don't throw raw RuntimeExceptions.
  They don't mean anything in the domain and they're not self explanatory
 */

/**
 * Something went wrong in the environment around the code.
 * It's not a bug in the code itself.
 */
public class EnvironmentFailure extends RuntimeException {
    public EnvironmentFailure(Throwable cause) {
        super(cause);
    }
}
