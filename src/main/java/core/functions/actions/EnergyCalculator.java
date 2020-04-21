package core.functions.actions;

import flanagan.integration.Integration;

public class EnergyCalculator {
    private Integration integration;

    public EnergyCalculator(Integration integration) {
        this.integration = integration;
    }

    public double execute(int interval) {
        return integration.backward(interval);
    }
}
