package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;
import lessonExceptions.exceptions.IncorrectGradeException;
import lessonExceptions.exceptions.LackOfItemsException;

import java.util.Map;

public class Student{
    private String studentName;
    private Map<StudySubject, int[]> gradebook;

    public Student(String studentName, Map<StudySubject, int[]> gradebook) throws LackOfItemsException {
        this.studentName = studentName;
        if(gradebook.size() > 0)
            this.gradebook = gradebook;
        else
            throw new LackOfItemsException(String.format("Список предметов не должен быть пустым. Размер списка учебных предметов: %d", gradebook.size()));
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public Map<StudySubject, int[]> getGradebook() {
        return gradebook;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGradebook(Map<StudySubject, int[]> gradebook) throws IncorrectGradeException {
        for (int[] scores : gradebook.values()) {
            for (int score : scores) {
                if (score > 10 || score < 0)
                    throw new IncorrectGradeException(String.format("Вы вышли за пределы диапазона оценок от 0 до 10. Вы указали: %d", score));
            }
        }
        this.gradebook = gradebook;
    }
}
