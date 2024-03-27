public class Student {

    String name="sachin";
    int age=20;
    String month;
    int date;
    int year;

    public Student(int date, String month, int year) {
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public void read(){
        System.out.print("Date of birth of the Student is: ");
        System.out.print(date +"/" + month+"/"+year);
    }

    public static void main(String[] args){
        Student s = new Student(14, "june", 2003);
        s.display();
        s.read();
    }
}

