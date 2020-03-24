

public class Test {
    public static void main(String[] args) {
          Date date=new Date(1,4,2020);
        Time time=new Time(1,30,00);
        Paper Pobj1=new Paper("1st term",date,time,"Ali zeb","BSCS","2nd","practical","zeeshan iqbal","kust",101,121,30);
        Paper Pobj2=new Paper("2nd term",date,time,"Ali zeb","BSSE","3rd","MID","Roman","kust",102,122,25);
        Paper Pobj3=new Paper("3rd term",date,time,"Ali zeb","MCS","4th","Final","shahid","kust",103,123,20);
        Course Cobj1=new Course("discrete maths",121,2020); 
        Course Cobj2=new Course("database",122,2019);
        Pobj1.setisCollected(false);
        Pobj2.setisCollected(true);
        Pobj3.setisCollected(true);
        Cobj1.setcourseCode(121);
        Cobj2.setcourseCode(122);
        System.out.println(Pobj1);
        System.out.println(Pobj2);
        System.out.println(Pobj3);
        System.out.println(Cobj1);
        System.out.println(Cobj2);
        
        
    }
    
}
