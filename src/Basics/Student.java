package Basics;

class student {
    int id;
    String name;
    static int age;
}

class genericsExample {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        student s4 = new student();

        s1.id=1;
        s2.id=2;
        s3.id=3;
        s4.id=4;

        s1.name="a";
        s2.name="b";
        s3.name="c";
        s4.name="d";

        s1.age=20;
        s2.age=30;
        s3.age=40;
        student.age =50;

        student students[] = new student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        for(student studentr : students) {
            System.out.println(studentr.age);
        }


    }
}
