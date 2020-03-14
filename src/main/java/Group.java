import java.util.List;

public class Group {

    private int id;
    private boolean groupFull;
    private List<Teacher> teacherList;
    private List<Class> ClassList;
    private List<Group> groupList;

    /**
     * this constructor to initialize group relying on classes in big or small school.
     * I passed list of classes because I assumed that group could contain more than one class.
     *
     * @param id          the teacher id
     * @param teacherList if many teachers in a group
     * @param classList   if many classes could create a group.
     * @param groupFull   true if full
     */
    public Group(int id, List<Teacher> teacherList, List<Class> classList, boolean groupFull) {
        this.id = id;
        this.groupFull = groupFull;
        this.teacherList = teacherList;
        this.ClassList = classList;
        setStudentsStatus();
    }

    public Group(List<Group> groupList) {
        this.groupList = groupList;
    }

    /**
     * this method set all students status to true which means they placed in a group.
     */
    public void setStudentsStatus() {
        for (Class a_class : this.ClassList)
            for (Student student : a_class.getStudentList())
                student.setPlacedInGroup(true);
    }

    /**
     * passing list of groups to print their details.
     */
    public void printExistingGroups() {
        for (Group group : groupList) {
            System.out.println(group.toString());
        }
    }

    @Override
    public String toString() {
        return "\nGroup id : " + id +
                "\nGroup is Full : " + groupFull +
                "\nTeachers in group : " + teacherList +
                "\n\nClasses Info : " + ClassList +
                '}';
    }

}
