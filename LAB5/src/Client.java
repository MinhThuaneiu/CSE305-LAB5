public class Client {
    private ContractBuilder contractBuilder;

    public Client(ContractBuilder contractBuilder) {
        this.contractBuilder = contractBuilder;
    }

    public Contract createRentalContract() {
        return contractBuilder.buildContractID()
                              .buildPropertyID()
                              .buildTenantID()
                              .buildRentAmount()
                              .signContract();
    }
}