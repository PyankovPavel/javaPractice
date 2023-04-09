package Lesson7VlMorozov.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private String id = "";
    private LocalDateTime creationDate = LocalDateTime.now();
    private String currentTime = creationDate.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    private String heading;
    private String body;

    public Note(String heading, String body) {
        this.heading = heading;
        this.body = body;
    }

    public Note(String id, String dateString, String heading, String body) {
        this(heading, body);
        this.currentTime = dateString;
        this.id = id;
        }

    public String getId() {
        return id;
    }

    public String getDateString() {
        return currentTime;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }

@Override
public String toString() {
    return String.format("Note number: %s\nDate: %s\nHeader: %s\nBody: %s",
            id,currentTime, heading, body);
}
}

