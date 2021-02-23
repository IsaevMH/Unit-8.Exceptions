package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class University {
    private String universityName;
    private List<Faculty> faculties;

    public String getUniversityName() {
        return universityName;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.faculties = faculties;

    }

    public void getAverageScore(String nameSubject){
        double sum = 0.0;
        int count = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudentList()) {
                    for (Map.Entry<StudySubject,int[]> studySubjectEntry : student.getGradebook().entrySet()) {
                        if(studySubjectEntry.getKey().compareTo(StudySubject.valueOf(nameSubject)) == 0){
                            sum += Arrays.stream(studySubjectEntry.getValue()).sum();
                            count += Arrays.stream(studySubjectEntry.getValue()).count();
                        }
                    }
                }
            }
        }
        System.out.println(sum/count);
    }
    public void getAverageScore(Student student){
        double sum = 0.0;
        int count = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                var currentStudent = group.getStudent(student);
                if(currentStudent != null){
                    for (Map.Entry<StudySubject, int[]> studySubjectEntry : currentStudent.getGradebook().entrySet()) {
                        sum += Arrays.stream(studySubjectEntry.getValue()).sum();
                        count += Arrays.stream(studySubjectEntry.getValue()).count();
                    }
                    System.out.println(sum/count);
                    break;
                }
            }
        }
    }
    public void getAverageScore(Group currentGroup, String nameSubject){
        double sum = 0.0;
        int count = 0;
        for (Faculty faculty : faculties) {
            var group = faculty.getGroup(currentGroup);
            if(group != null){
                for (Student student : group.getStudentList()) {
                    for (Map.Entry<StudySubject,int[]> studySubjectEntry : student.getGradebook().entrySet()) {
                        if(studySubjectEntry.getKey().compareTo(StudySubject.valueOf(nameSubject.toUpperCase())) == 0) {
                            sum += Arrays.stream(studySubjectEntry.getValue()).sum();
                            count += Arrays.stream(studySubjectEntry.getValue()).count();
                        }
                    }
                }
                System.out.println(sum/count);
            }
        }
    }
}
