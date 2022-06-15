package chain_of_responsibility;

public class WARNING extends Logger {
    public WARNING(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Warning: " + message);
    }
}
