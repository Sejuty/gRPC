package chain_of_responsibility;

public abstract class Logger {


    public static int LOG = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            System.out.println(this.level +"====="+level);
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
