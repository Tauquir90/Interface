public class Student implements  Cloneable {
    //concept of cloning.....
    String sid;
    String sname;
    String saddr;
    String semail;
    String phone;

    public Student(String sid, String sname, String saddr, String semail, String phone) {
        this.sid= sid;
         this.sname=sname;
         this.saddr=saddr;
         this.semail=semail;
        this.phone = phone;
    }
    public void getDetails()
    {
        System.out.println("STUDENT DETAILS.................");
        System.out.println();
        System.out.println("STUDENT ID          : "+sid);
        System.out.println("STUDENT NAME        : "+sname);
        System.out.println("STUDENT ADDRESS     : "+saddr);
        System.out.println("STUDENT EMAIL       : "+semail);
        System.out.println("STUDENT PHONE       : "+phone);
    }
    public Object clone() throws CloneNotSupportedException{
        Object object = super.clone();
        return object;
    }
}
