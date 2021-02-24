package lessonExceptions.entities;

import lessonExceptions.exceptions.EmptyFacultyException;

import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;

    public String getFacultyName() {
        return facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Group getGroup(Group group){
        if(groups.contains(group))
            return group;
        else
            return null;
    }

    public Faculty(String facultyName, List<Group> groups) throws EmptyFacultyException {
        this.facultyName = facultyName;
        if(groups.size() > 0)
            this.groups = groups;
        else
            throw new EmptyFacultyException("Факультет не может быть пустым. Необходимо добавить хотя бы одну группу");
    }
}
