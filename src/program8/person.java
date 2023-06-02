package program8;
interface Detailinfo{
    void display();
    void count();

}

class person implements Detailinfo {
     String name;
     static int count;

    person(String name){
        this.name=name;
    }
    @Override
    public void display() {
        System.out.println("The name is "+name);

    }

    @Override
    public void count() {
        count=name.length();
        System.out.println("The number of characters are "+count);

    }
}
