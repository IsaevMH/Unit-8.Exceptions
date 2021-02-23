package lessonExceptions.entities;

import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }
}
