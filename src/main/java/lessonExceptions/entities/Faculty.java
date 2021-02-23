package lessonExceptions.entities;

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

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }
}
