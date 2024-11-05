public class PermanentContractBuilder implements ContractBuilder {
    private Contract contract;

    public PermanentContractBuilder() {
        this.contract = new Contract();
    }

    @Override
    public ContractBuilder buildContractID() {
        contract.setContractID("PERM12345");
        return this;
    }

    @Override
    public ContractBuilder buildPropertyID() {
        contract.setPropertyID("PROP001");
        return this;
    }

    @Override
    public ContractBuilder buildTenantID() {
        contract.setTenantID("TENANT001");
        return this;
    }

    @Override
    public ContractBuilder buildRentAmount() {
        contract.setRentAmount(1000.0);  // Example rent for permanent contract
        return this;
    }

    @Override
    public Contract signContract() {
        return this.contract;
    }
}