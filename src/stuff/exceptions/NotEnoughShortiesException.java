package stuff.exceptions;

public class NotEnoughShortiesException extends Exception {
    public NotEnoughShortiesException() {
        super("\n!!!ОТЛОВЛЕНА ОШИБКА!!!\nСлишком мало коротышек,измените размер массива и попробуйте ещё раз.\n\r Дальнейшие действия с коротышками невозможны!\n!!!ОТЛОВЛЕНА ОШИБКА!!!\n");
    }
}
