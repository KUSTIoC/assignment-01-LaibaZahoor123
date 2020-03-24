


public class Course {
    private  final String courseName;
    private int courseCode;
    private String programName;
    private int courseOffered;

    public Course(String courseName, int courseCode,int courseOffered) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseOffered = courseOffered;
        
        
    }
    
    public String getcourseName() {
        return courseName;
    }

    public int getcourseCode() {
        return courseCode;
    }

    public void setcourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString(){
        return String.format("course name = %s course code = %d course offered = %d " ,courseName,courseCode,courseOffered);
    }
    
    
    
}
