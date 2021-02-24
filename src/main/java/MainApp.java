
import lessonExceptions.entities.Faculty;
import lessonExceptions.entities.Group;
import lessonExceptions.entities.Student;
import lessonExceptions.entities.University;
import lessonExceptions.enums.StudySubject;
import lessonExceptions.exceptions.*;

import javax.xml.transform.ErrorListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class MainApp{
    public static void main(String[] args) throws IncorrectGradeException, LackOfItemsException, EmptyUniversityException, FileNotFoundException {
        PrintWriter writer = new PrintWriter("errorsLog.txt");
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


        Student studentWithInccorectGrade = new Student();
        studentWithInccorectGrade.setStudentName("Georgy");
        try{
            studentWithInccorectGrade.setGradebook(new HashMap<>(){{
                this.put(StudySubject.INFORMATIC, new int[]{11, -1});
            }});
        }
        catch (IncorrectGradeException message){
            writer.write(message.toString() + "\n");
        }

        Student studentWithoutStudySubject = null;
        try{
            studentWithoutStudySubject = new Student("Andrey",
                    new HashMap<>() {
                        {
                        }
                    });
        }
        catch (LackOfItemsException message){
            writer.write(message.toString() + "\n");
        }


        Group groupWithoutStudents = null;
        try{
            groupWithoutStudents = new Group("SomeGroup", new ArrayList<>());
        }
        catch (EmptyGroupException message){
            writer.write(message.toString() + "\n");
        }

        Faculty facultyWithoutGroups = null;
        try{
            facultyWithoutGroups = new Faculty("SomeFaculty", new ArrayList<>());
        }
        catch (EmptyFacultyException message){
            writer.write(message.toString() + "\n");
        }

        University emptyUniversity = null;
        try{
            emptyUniversity = new University("SomeUniversity", new ArrayList<>());
        }
        catch (EmptyUniversityException message){
            writer.write(message.toString() + "\n");
            writer.close();
        }

    }
}
