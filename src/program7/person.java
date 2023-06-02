package program7;

class person {
    static String name;
    static int age;

    public person(String name, int age) {
        this.name=name;
        this.age=age;
    }
}
class employee extends person{

    static int eid;
    static double salary;
    public employee(String name, int age, int eid, double salary){
        super(name,age);
        employee.eid =eid;
        employee.salary =salary;
    }
    public static void empDis(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Eid is "+eid);
        System.out.println("Salary is "+salary);
    }
}

