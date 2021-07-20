import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MyApp {

    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(final String... args) {

        logger.trace(
                "This is a Trace Message for illustration purpose only! This is the highest level which prints all trace, debug, info, warn, error and fatal logs.");
        logger.debug(
                "This is a Debug Message for illustration purpose only! This log level prints debug, info, warn, error and fatal logs.");
        logger.info(
                "This is a Info Message for illustration purpose only! This log level prints info, warn, error and fatal logs.");
        logger.warn(
                "This is a Warn Message for illustration purpose only! This log level prints warn, error and fatal logs.");
        logger.error(
                "This is a Error Message for illustration purpose only! This log level prints error and fatal logs.");

        logger.fatal(
                "This is a Fatal Message for illustration purpose only! This log level is the lowest level, and prints only fatal logs.");
    }
}