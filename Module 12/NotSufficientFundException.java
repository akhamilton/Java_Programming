public class NotSufficientFundException extends Exception {

    private String message;
        
    public NotSufficientFundException(String message){
        this.message = message;
    }
        
    public NotSufficientFundException (Throwable cause, String message) {
        super(cause);
        this.message = message;
    }
        
    public String getMessage() {
        return message;
    } 
}
