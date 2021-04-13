package stuff.exceptions;

public class NotEnoughFoodException extends RuntimeException {
    public NotEnoughFoodException() {
        super("В ракете недостаточно еды!");
    }
}
