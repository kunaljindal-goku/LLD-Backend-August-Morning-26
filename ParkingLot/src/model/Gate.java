package model;

import model.enums.GateStatus;
import model.enums.GateType;

public class Gate extends BaseEntity{

    private String gateName;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(String gateName, GateType gateType, Operator operator, GateStatus gateStatus) {
        this.gateName = gateName;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
