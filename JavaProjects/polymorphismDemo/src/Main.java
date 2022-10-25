public class Main {
    public static void main(String[] largs) {
        /*
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log mesaji");
            }
        */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
