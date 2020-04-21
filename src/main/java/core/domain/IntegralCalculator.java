package core.domain;
import core.domain.functions.Function;
import flanagan.integration.IntegralFunction;

public class IntegralCalculator implements IntegralFunction {

    private Function function;

    public IntegralCalculator(Function function){ this.function = function;}

    public double function(double variable) { return function.execute(variable); }
}
