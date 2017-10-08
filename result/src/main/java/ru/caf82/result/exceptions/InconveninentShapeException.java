package ru.caf82.HomeWork.homework3.exceptions;

public class InconveninentShapeException extends Exception {
    InconveninentShapeException() {
        super();
    }
    InconveninentShapeException(Throwable cause) {
    super(cause);
    }
    InconveninentShapeException(String message){
    super(message);
    }
    InconveninentShapeException(String message, Throwable cause){
     super(message, cause);
     }
    
}
