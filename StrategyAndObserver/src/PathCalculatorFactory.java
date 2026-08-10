import java.util.HashMap;
import java.util.Map;

public class PathCalculatorFactory {

    static Map<String, PathCalculator> pathCalculatorMap = new HashMap<>();

    static {
        pathCalculatorMap.put("car",new CarPathCalculator());
        pathCalculatorMap.put("walk", new WalkPathCalculator());
        pathCalculatorMap.put("train", new TrainPathCalculator());
    }

    public static PathCalculator getPathCalculator(String mode) {
//        if(mode.equalsIgnoreCase("car")) return new CarPathCalculator();
//        else if(mode.equalsIgnoreCase("walk")) return new WalkPathCalculator();
//        else if(mode.equalsIgnoreCase("train")) return new TrainPathCalculator();
//        throw new RuntimeException("Invalid mode selected");

        if(pathCalculatorMap.containsKey(mode)) {
            return pathCalculatorMap.get(mode);
        }

        throw new RuntimeException("Invalid mode");
    }
}
