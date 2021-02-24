package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;
import lessonExceptions.exceptions.EmptyGroupException;

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

    public Group(String nameGroup, List<Student> studentList) throws EmptyGroupException {
        this.nameGroup = nameGroup;
        if(studentList.size() > 0)
            this.studentList = studentList;
        else
            throw new EmptyGroupException("Учебная группа не должна быть пустой, добавьте хотя бы одного студента");
    }
}
