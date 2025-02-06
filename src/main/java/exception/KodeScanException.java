package exception;

public class KodeScanException extends Exception{

    public KodeScanException(String message) {
        super(message);
    }

    public KodeScanException(String message, Throwable cause) {
        super(message, cause);
    }
}
