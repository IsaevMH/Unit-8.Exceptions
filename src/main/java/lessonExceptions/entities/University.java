package lessonExceptions.entities;

import java.util.List;
import java.util.Map;

public class University {
    private String universityName;
    private List<Faculty> faculties;

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.faculties = faculties;
    }
}
