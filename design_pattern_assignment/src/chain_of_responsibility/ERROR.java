package chain_of_responsibility;

public class ERROR extends Logger {

    public ERROR(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error : " + message);
    }
}
