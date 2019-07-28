package stores.com;


/**
 *
 */
public class DroneApp {

    public static void main(String[] args) throws Exception {
        DroneApp dap = new DroneApp();
        dap.runApp(args);
    }

   public void runApp(String[] args) throws Exception {
        String inputFilePath = "drone_input.txt";
        String outputFilePath = "drone_output.txt";
        Order[] orders = OrderFactory.readFromInputForDron(inputFilePath);
        Scheduler sch = new Scheduler(orders);
        sch.sweepingScheduler();
        OrderFactory.writeSimulationResults(outputFilePath, sch.getOrders());
    }


}
