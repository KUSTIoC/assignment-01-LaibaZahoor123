

public class Paper {

    
    private String paperTitle;
    private int paperId;
    private boolean isCollected;
    private Date dateofpaper;
    private Time timeofpaper;
    private int courseCode;
    private String courseIncharge;
    private String program;
    private int no_of_student;
    private String semester;
    private String typeExam;
    private String invigilator;
    private String location;
   
   
    public Paper(String paperTitle,Date dateofpaper,Time timeofpaper ,String courseIncharge,String program,String semester,String typeExam,String invigilator,String location,int paperId,int courseCode,int no_of_student) {
        this.paperTitle = paperTitle;
        this.dateofpaper=dateofpaper;
        this.timeofpaper=timeofpaper;
        this.courseIncharge=courseIncharge;
        this.program=program;
        this.semester=semester;
        this.typeExam=typeExam;
        this.invigilator=invigilator;
        this.location=location;
        this.isCollected=false;
        this.paperId=paperId;
        this.courseCode=courseCode;
        this.no_of_student=no_of_student;
    
}

    public Date getdateofpaper() {
        return dateofpaper;
    }

    public Time gettimeofpaper() {
        return timeofpaper;
    }

    public int getcourseCode() {
        return courseCode;
    }

    public String getcourseIncharge() {
        return courseIncharge;
    }

    public String getprogram() {
        return program;
    }

    public int getno_of_student() {
        return no_of_student;
    }

    public String getsemester() {
        return semester;
    }

    public String gettypeExam() {
        return typeExam;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getLocation() {
        return location;
    }
    

    public String getpaperTitle() {
        return paperTitle;
    }
    public int getpaperId() {
        return paperId;
    }
    public void setisCollected(boolean isCollected)
    {
        this.isCollected=isCollected;
    }


    public boolean getisCollected() {
        return isCollected;
    }
    
    @Override
    public String toString() {
        return  String.format("paperTitle= %s , paperId= %d , isCollected= %b , dateofpaper= %s , timeofpaper= %s ,  courseCode= %d , courseIncharge= %s , program= %s , no_of_student= %d , semester= %s ,  typeExam= %s , invigilator= %s , location= %s" , paperTitle,paperId,isCollected,dateofpaper,timeofpaper,courseCode,courseIncharge,program,no_of_student,semester,typeExam,invigilator,location);
    }
   
 
}