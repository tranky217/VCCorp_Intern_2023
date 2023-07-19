package Week3.Exception;

public class MyUncheckedException extends RuntimeException{
    private static final long serialVersionUID = 1111L;

    private final int code;

    public MyUncheckedException(int code) {
        super();
        this.code = code;
    }

    public MyUncheckedException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public MyUncheckedException(String message, int code) {
        super(message);
        this.code = code;
    }

    public MyUncheckedException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
