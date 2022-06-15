package chain_of_responsibility;

public class LOG extends Logger {

    public LOG(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Log: "+ message);

    }


}


