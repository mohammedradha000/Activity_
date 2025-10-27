package class_work;
public class Class_work_class {
    


    private int hour;
    private int minute;
    private int second;
   
    
    public Class_work_class(int hour,int minute,int second){
    this.hour=hour;
    this.minute=minute;
    this.second=second;}
   
   
    public Class_work_class(int x,int y){
    this(x,y,0);
    }
   
    
    public Class_work_class(int x){
    this(x,0,0);
    }
    
    
    public Class_work_class(){
    this(0,0,0);
    }
   
 
    void run(){
    System.out.println(hour+":"+minute+":"+second);
    
    }
    
    

      
       
   public void sethour(int hour){
       this.hour=hour;
   }
   public void setminute(int minute){
              this.minute=minute;

   }
   public void setsecond(int second){

       this.second=second;
   }
   

   
   
}
