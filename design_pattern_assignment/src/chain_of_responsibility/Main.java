package chain_of_responsibility;

public class Main {
    private static Logger getChainOfLoggers(){

        Logger error = new ERROR(Logger.ERROR);
        Logger warning = new WARNING(Logger.WARNING);
        Logger log = new LOG(Logger.LOG);

        error.setNextLogger(warning);
        warning.setNextLogger(log);

        return error;
    }
    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.ERROR,
                "This is an error information.");

        loggerChain.logMessage(Logger.WARNING,
                "This is an warning information.");

        loggerChain.logMessage(Logger.LOG,
                "This is an information.");

    }
}
