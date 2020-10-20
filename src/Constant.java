
    import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

    public class Constant {

        public static final Map<ProductTypes, BigDecimal> PRICES = new HashMap<>();

        static{
            PRICES.put(ProductTypes.APPLE, new BigDecimal(".60").setScale(2));
            PRICES.put(ProductTypes.ORANGE, new BigDecimal(".25").setScale(2));
        }
    }

