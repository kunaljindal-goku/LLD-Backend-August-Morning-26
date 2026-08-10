public class GoogleMaps {

    Path findPath(String source, String dest, String mode) {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        return pathCalculator.findPath(source,dest);
    }
}
