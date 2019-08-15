import java.math.BigDecimal;

public class Operation {

    public static BigDecimal somma(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    public static BigDecimal sottrai(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    public static BigDecimal dividi(BigDecimal a, BigDecimal b){
        return a.divide(b);
    }
}
