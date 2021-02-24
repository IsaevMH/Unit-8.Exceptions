import lessonExceptions.entities.Faculty;
import lessonExceptions.entities.Group;
import lessonExceptions.entities.Student;
import lessonExceptions.entities.University;
import lessonExceptions.enums.StudySubject;
import lessonExceptions.exceptions.EmptyFacultyException;
import lessonExceptions.exceptions.EmptyGroupException;
import lessonExceptions.exceptions.EmptyUniversityException;
import lessonExceptions.exceptions.LackOfItemsException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Initializator {
    static List<Group> groupsOfIitikFaculty;

    static {
        try {
            groupsOfIitikFaculty = Arrays.asList(
                    new Group("ИИТиК-1", Arrays.asList(
                            new Student("Andrey",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.INFORMATIC, new int[]{5, 4, 5});
                                            put(StudySubject.MATHEMATIC, new int[]{4, 4, 4});
                                        }
                                    }
                            ),
                            new Student("Kirill",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.INFORMATIC, new int[]{3, 3, 4});
                                            put(StudySubject.MATHEMATIC, new int[]{3, 4, 3});
                                            put(StudySubject.OS_ADMINISTRATIN, new int[]{4, 5, 4});
                                        }
                                    }
                            ),
                            new Student("Ivan",
                                    new HashMap<>()
                                    {
                                        {
                                            put(StudySubject.INFORMATIC, new int[]{3,3,4});
                                            put(StudySubject.MATHEMATIC, new int[]{4,5,4});
                                            put(StudySubject.INFORMTATION_SECURITY, new int[]{3,4,3});
                                        }
                                    }
                            )
                    )),
                    new Group("ИИТиК-2", Arrays.asList(
                            new Student("Evgeny",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.NETWORKS, new int[]{5, 4, 5});
                                            put(StudySubject.MATHEMATIC, new int[]{4, 4, 4});
                                        }
                                    }
                            ),
                            new Student("Sergey",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.NETWORKS, new int[]{3, 3, 4});
                                            put(StudySubject.MATHEMATIC, new int[]{3, 4, 3});
                                            put(StudySubject.OS_ADMINISTRATIN, new int[]{4, 5, 4});
                                        }
                                    }
                            ),
                            new Student("Denis",
                                    new HashMap<>()
                                    {
                                        {
                                            put(StudySubject.INFORMATIC, new int[]{3,3,4});
                                            put(StudySubject.MATHEMATIC, new int[]{4,5,4});
                                            put(StudySubject.TECHNOLOGY, new int[]{3,4,3});

                                        }
                                    }
                            )
                    ))
            );
        } catch (LackOfItemsException | EmptyGroupException e) {
            e.printStackTrace();
        }
    }

    static List<Group> groupsOfNatFaculty;

    static {
        try {
            groupsOfNatFaculty = Arrays.asList(
                    new Group("Nat-1", Arrays.asList(
                            new Student("Maxim",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.TECHNOLOGY, new int[]{5, 4, 5});
                                            put(StudySubject.PHYSICS, new int[]{4, 4, 4});
                                        }
                                    }
                            ),
                            new Student("Aleksandr",
                                    new HashMap<>() {
                                        {
                                            put(StudySubject.TECHNOLOGY, new int[]{3, 3, 4});
                                            put(StudySubject.PHYSICS, new int[]{3, 4, 3});
                                            put(StudySubject.OS_ADMINISTRATIN, new int[]{4, 5, 4});
                                        }
                                    }
                            ),
                            new Student("Dmitry",
                                    new HashMap<>()
                                    {
                                        {
                                            put(StudySubject.TECHNOLOGY, new int[]{3,3,4});
                                            put(StudySubject.PHYSICS, new int[]{4,5,4});
                                            put(StudySubject.MATHEMATIC, new int[]{3,4,3});
                                        }
                                    }
                            )
                    ))
            );
        } catch (LackOfItemsException | EmptyGroupException e) {
            e.printStackTrace();
        }
    }

    static List<Faculty> faculties;

    static {
        try {
            faculties = Arrays.asList(
                    new Faculty("Информационные технологии и телекоммуникации", groupsOfIitikFaculty),
                    new Faculty("Сети и телекоммуникации", groupsOfNatFaculty)
            );
        } catch (EmptyFacultyException e) {
            e.printStackTrace();
        }
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
    public ArrayList<University> getUniversities() throws EmptyUniversityException {
        return new ArrayList<University>() {
            {
            this.add(new University("Astrakhan Technical State University", faculties));
        }
        };
    }
}
