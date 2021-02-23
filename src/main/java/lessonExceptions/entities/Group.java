package lessonExceptions.entities;

import java.util.List;
import java.util.Map;

public class Group {
    private String nameGroup;
    private List<Student> studentList;
    public Group(String nameGroup, List<Student> studentList) {
        this.nameGroup = nameGroup;
        this.studentList = studentList;
    }
}
