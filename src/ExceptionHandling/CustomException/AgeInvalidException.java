package ExceptionHandling.CustomException;

public class AgeInvalidException extends RuntimeException {

    private String message;

    AgeInvalidException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
