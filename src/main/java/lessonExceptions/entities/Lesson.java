package lessonExceptions.entities;

import lessonExceptions.enums.StudySubject;

public class Lesson {
    private StudySubject nameLesson;
    private int[] scores;

    public Lesson(StudySubject nameLesson, int[] scores) {
        this.nameLesson = nameLesson;
        this.scores = scores;
    }
}
