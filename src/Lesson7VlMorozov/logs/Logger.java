package Lesson7VlMorozov.logs;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger implements LogSaver {
    private String loggerName;

    public Logger(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public void saveToLog(String event) {
        try (FileWriter writer = new FileWriter(loggerName, true)) {
            LocalDateTime currentTime = LocalDateTime.now();
            writer.write(String.format("%s, %s \n", currentTime, event));
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
