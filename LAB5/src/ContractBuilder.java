public interface ContractBuilder {
    ContractBuilder buildContractID();
    ContractBuilder buildPropertyID();
    ContractBuilder buildTenantID();
    ContractBuilder buildRentAmount();
    Contract signContract();
}