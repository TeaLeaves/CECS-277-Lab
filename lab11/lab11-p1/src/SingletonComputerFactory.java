public class SingletonComputerFactory {
    private static SingletonComputerFactory singletonFactory;
    // SingletonExample prevents any other class from instantiating (YOUR CODE)
    private SingletonComputerFactory(){}

    // Providing Global point of access
    public static SingletonComputerFactory getSingletonFactory() {
        //YOUR CODE
        singletonFactory = new SingletonComputerFactory();
        return singletonFactory;
    }

    public Computer getComputer(String type, String ram, String hdd, String cpu)
    {   if("PC".equalsIgnoreCase(type))
        return new PC(ram, hdd, cpu);
    else if("Server".equalsIgnoreCase(type))
        return new Server(ram, hdd, cpu);
        return null;
    }
}
