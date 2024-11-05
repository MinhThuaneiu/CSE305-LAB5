public class ShortTermContractBuilder implements ContractBuilder {
    private Contract contract;

    public ShortTermContractBuilder() {
        this.contract = new Contract();
    }

    @Override
    public ContractBuilder buildContractID() {
        contract.setContractID("SHORT12345");
        return this;
    }

    @Override
    public ContractBuilder buildPropertyID() {
        contract.setPropertyID("PROP003");
        return this;
    }

    @Override
    public ContractBuilder buildTenantID() {
        contract.setTenantID("TENANT003");
        return this;
    }

    @Override
    public ContractBuilder buildRentAmount() {
        contract.setRentAmount(500.0);  // Example rent for short-term contract
        return this;
    }

    @Override
    public Contract signContract() {
        return this.contract;
    }
}