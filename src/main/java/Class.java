import java.util.List;

public class Class {

    private int id;
    private String className;
    private int gradeLevelBigSchool;
    private boolean bigSchool;
    private List<Student> studentList;
    private List<Integer> gradeLevelSmallSchool;

    /**
     * this constructor for big school, it might be they have many classes for same gradeLevel.
     *
     * @param id          the class id
     * @param className   class name ex: 1A,2B
     * @param gradeLevel  grade level ex: 2,4,3
     * @param studentList list of student in that class.
     */
    public Class(int id, String className, int gradeLevel, List<Student> studentList) {
        this.id = id;
        this.bigSchool = true;
        this.className = className;
        this.gradeLevelBigSchool = gradeLevel;
        this.studentList = studentList;
    }

    /**
     * this constructor for small school, it might be they have many grade levels in a class.
     *
     * @param id                    the class id
     * @param className             the class name
     * @param studentList           list of student in that class
     * @param gradeLevelSmallSchool small schools could have many grade level for each class.
     */
    public Class(int id, String className, List<Integer> gradeLevelSmallSchool, List<Student> studentList) {
        this.id = id;
        this.bigSchool = false;
        this.className = className;
        this.studentList = studentList;
        this.gradeLevelSmallSchool = gradeLevelSmallSchool;
    }

    public int getId() {
        return id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        if (bigSchool) {
            return "\nClass Name : '" + className + '\'' +
                    ", Grade level : " + gradeLevelBigSchool +
                    ", bigSchool : " + true +
                    "\nStudents in Class : " + studentList + '\n';
        } else {
            return "\nClass Name : '" + className + '\'' +
                    ", Grade level : " + gradeLevelSmallSchool +
                    ", bigSchool : " + false +
                    ",\nStudents in Class : " + studentList + '\n';
        }
    }

    /**
     * this method gives all students inside a class by entering the class id
     * I passed classList as parameter because I don't have DB to read classes from.
     *
     * @param classList list of classes
     * @param classID   class we are looking for by this id.
     * @return list of students in a specific class
     * @throws IllegalArgumentException if id is not right.
     */
    public List<Student> getStudentListById(List<Class> classList, int classID) {
        for (Class a_class : classList)
            if (a_class.getId() == classID)
                return a_class.getStudentList();

        throw new IllegalArgumentException("Class id is not found");
    }

    /**
     * this method add new student to a class
     *
     * @param newStudent new student object
     */
    public void addStudentToClass(Student newStudent) {
        this.studentList.add(newStudent);
    }

    /**
     * this method removes student from a class by entering right id number
     *
     * @param studentId looking for student by that id.
     */
    public void removeStudentFromClassById(int studentId) {
        this.studentList.removeIf(student -> student.getId() == studentId);
    }
}
