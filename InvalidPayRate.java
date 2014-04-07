public class InvalidPayRate extends Exception {

    public InvalidPayRate() {
        super("You can not place a negative hourly wage! ");
    }

}
