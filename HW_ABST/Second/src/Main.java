import logger.SimpleLogger;
import logger.SmartLogger;

public class Main {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        SmartLogger smartLogger = new SmartLogger();

        simpleLogger.log("test log");
        simpleLogger.log("test log1");
        simpleLogger.log("test log2");

        smartLogger.log("test log error");
        smartLogger.log("test log ERROR1");
        smartLogger.log("test log2");
        smartLogger.log("test log3");
    }
}