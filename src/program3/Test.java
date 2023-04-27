package program3;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        s1.getdata();
        s2.getdata();
        s3.getdata();
        s4.getdata();
        s5.getdata();
        if (s1.DSA_Mark> s2.DSA_Mark && s1.DSA_Mark> s3.DSA_Mark && s1.DSA_Mark> s4.DSA_Mark && s1.DSA_Mark> s5.DSA_Mark) s1.showdata();
        else if (s2.DSA_Mark> s1.DSA_Mark && s2.DSA_Mark> s3.DSA_Mark && s2.DSA_Mark> s4.DSA_Mark && s2.DSA_Mark> s5.DSA_Mark) s2.showdata();
        else if (s3.DSA_Mark> s2.DSA_Mark && s3.DSA_Mark> s1.DSA_Mark && s3.DSA_Mark> s4.DSA_Mark && s3.DSA_Mark> s5.DSA_Mark) s3.showdata();
        else if (s4.DSA_Mark> s2.DSA_Mark && s4.DSA_Mark> s3.DSA_Mark && s4.DSA_Mark> s1.DSA_Mark && s4.DSA_Mark> s5.DSA_Mark) s4.showdata();
        else{
            s5.showdata();
        }
    }
}
