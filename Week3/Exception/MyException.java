package Week3.Exception;

public class MyException extends Exception{
        private static final long serialVersionUID = 1111L;

        private final int code;

        public MyException(int code) {
            super();
            this.code = code;
        }

        public MyException(String message, Throwable cause, int code) {
            super(message, cause);
            this.code = code;
        }

        public MyException(String message, int code) {
            super(message);
            this.code = code;
        }

        public MyException(Throwable cause, int code) {
            super(cause);
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }
}
