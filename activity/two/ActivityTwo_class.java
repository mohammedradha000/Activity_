package activity.two;
public class ActivityTwo_class {
    private  int adder = 0;
   private int ID;
    private String Name;
    private final String Department="cs";
    private int Semester;
    
    
    public ActivityTwo_class(String Name,int Semester){

    adder++;
    this.ID=adder;
    this.Name=Name;
    this.Semester=Semester;
    
   }
    
    public void setName(String Name){
       this.Name=Name;
   }
    public void setSemester(int Semester){
       this.Semester=Semester;
   }

    
    void output(){
        System.out.println("*********************");
        System.out.println("Student ID:"+ID);
        System.out.println("Student Name:"+Name);
        System.out.println("Department:"+Department);
        System.out.println("Semester:"+Semester);
        System.out.println("*********************");
    }
     
   
    
    
}