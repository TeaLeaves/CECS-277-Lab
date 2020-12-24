public class Test {
    public static void main(String[] args){
        Employee e1 = new Employee("bob", 100);
        Employee e2 = new Employee();
        Manager m1 = new Manager("karen", 10000.00);
        Executive e3 = new Executive("linda", 100000.00);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(m1.toString());
        System.out.println(e3.toString());
    }
}
