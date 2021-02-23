package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student{
    private String studentName;
    private Map<StudySubject, int[]> gradebook;
    public Student(String studentName, Map<StudySubject, int[]> gradebook) {
        this.studentName = studentName;
        this.gradebook = gradebook;
    }

    public String getStudentName() {
        return studentName;
    }

    public Map<StudySubject, int[]> getGradebook() {
        return gradebook;
    }
}
