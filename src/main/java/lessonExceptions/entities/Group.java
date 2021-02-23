package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Group {
    private String nameGroup;
    private List<Student> studentList;

    public String getNameGroup() {
        return nameGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Student getStudent(Student student){
        for (Student currentStudent : studentList) {
            if (currentStudent.getStudentName().equals(student.getStudentName()))
                return student;
        }
            return null;
    }

    public Group(String nameGroup, List<Student> studentList) {
        this.nameGroup = nameGroup;
        this.studentList = studentList;
    }
}
