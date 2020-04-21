package core;

import core.actions.EnergyCalculator;
import core.domain.functions.Cosine;
import core.domain.functions.Function;
import core.domain.IntegralCalculator;
import flanagan.integration.Integration;
import org.junit.Assert;
import org.junit.Test;

public class EnergyTest {
    private IntegralCalculator integralCalculator;
    private Integration integration;
    private EnergyCalculator energyCalculator;

    @Test
    public void CalculateEnergyToExercise3point1(){
        GivenAIntegralCalculator(new Cosine());
        GivenAIntegration(integralCalculator);
        GivenAEnergyCalculator(integration);

        double result = energyCalculator.execute(5000);

        Assert.assertEquals(result, 2, 0.001);
    }

    private void GivenAIntegralCalculator(Function function) {
        integralCalculator = new IntegralCalculator(function);
    }

    private void GivenAIntegration(IntegralCalculator function) {
        integration = new Integration(function);
        integration.setLimits(0,1);
    }

    private void GivenAEnergyCalculator(Integration integration) {
        energyCalculator = new EnergyCalculator(integration);
    }
}
