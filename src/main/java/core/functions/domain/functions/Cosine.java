package core.functions.domain.functions;

public class Cosine implements Function{
    public double execute(double variable){
        return Math.pow( 2* Math.cos(2 * Math.PI* variable),2);
    }
}
