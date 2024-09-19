package inheritance;

public interface I2 {
    default String getGreeting() {
        return "Good Afternoon!";
    }
}
