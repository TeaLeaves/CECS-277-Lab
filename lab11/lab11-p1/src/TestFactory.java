public class TestFactory {
    public static void main(String[] args) {
        //Create an object of SingletonComputerFactory (YOUR CODE)
        SingletonComputerFactory fc = SingletonComputerFactory.getSingletonFactory();

        Computer pc = fc.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = fc.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }

}