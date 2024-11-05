public class LongTermContractBuilder implements ContractBuilder {
    private Contract contract;

    public LongTermContractBuilder() {
        this.contract = new Contract();
    }

    @Override
    public ContractBuilder buildContractID() {
        contract.setContractID("LONG12345");
        return this;
    }

    @Override
    public ContractBuilder buildPropertyID() {
        contract.setPropertyID("PROP002");
        return this;
    }

    @Override
    public ContractBuilder buildTenantID() {
        contract.setTenantID("TENANT002");
        return this;
    }

    @Override
    public ContractBuilder buildRentAmount() {
        contract.setRentAmount(800.0);  // Example rent for long-term contract
        return this;
    }

    @Override
    public Contract signContract() {
        return this.contract;
    }
}