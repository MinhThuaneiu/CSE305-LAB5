public class App {
    public static void main(String[] args) throws Exception {
        Client client1 = new Client(new PermanentContractBuilder());
        Contract permanentContract = client1.createRentalContract();
        System.out.println(permanentContract);

        // Create a Long Term Contract
        Client client2 = new Client(new LongTermContractBuilder());
        Contract longTermContract = client2.createRentalContract();
        System.out.println(longTermContract);

        // Create a Short Term Contract
        Client client3 = new Client(new ShortTermContractBuilder());
        Contract shortTermContract = client3.createRentalContract();
        System.out.println(shortTermContract);
    }
}
