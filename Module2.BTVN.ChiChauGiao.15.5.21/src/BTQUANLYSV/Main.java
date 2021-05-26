package BTQUANLYSV;

public class Main {
    public static void main(String[] args) {
        ManageStudent st=new ManageStudent();
        st.addStudent("C-100",new Student("Tan",11,22));
        st.display();
    }
}
