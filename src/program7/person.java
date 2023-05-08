package program7;

class person {
    static String name;
    static int age;

}
class employee extends person{

    static int eid;
    static double salary;
    public employee(String name, int age, int eid, double salary){
        person.name =name;
        person.age=age;
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

