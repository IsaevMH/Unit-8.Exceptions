
import lessonExceptions.entities.University;

import java.util.List;

public class MainApp{

    public static void main(String[] args) {
        Initializator initializator = new Initializator();
        List<University> university = initializator.getUniversities();

        University currentUniversity = university.get(0);

        //Output arrange score at particular student for all subject
        var currentStudent = currentUniversity.getFaculties().get(0).getGroups().get(0).getStudentList().get(0);
        currentUniversity.getAverageScore(currentStudent);

        //Output arrange score particular subject at current group of the current faculty
        var currentGroutOfCurrentFaculty = currentUniversity.getFaculties().get(0).getGroups().get(0);
        currentUniversity.getAverageScore(currentGroutOfCurrentFaculty, "informatic");

        //Output average score at particular subject all students of the university
        currentUniversity.getAverageScore("MATHEMATIC");
    }
}
