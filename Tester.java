public class Tester {
    public static void main(String...args) throws CloneNotSupportedException {
        Student st = new Student("S111","TAUQUIR",
                "MUKUNDAPUR","xyz@gmail.com",
                "7044607942");
        System.out.println("ORIGINAL STUDENT DETAILS........");
        System.out.println("ORIGINAL OBJECT  :"+st);
        st.getDetails();
        Object obj = st.clone();
        Student dup = (Student)obj;
        System.out.println("DUPLICATE OBJECT: "+dup);
        System.out.println("SHOWING DUPLICATE OBJECT DETAILS ...");
        dup.getDetails();
    }
}
