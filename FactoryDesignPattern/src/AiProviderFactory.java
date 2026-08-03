import java.util.HashMap;
import java.util.Map;

public class AiProviderFactory {

    private static Map<String, AiProviders> aiProvidersMap;

    public AiProviderFactory() {
        this.aiProvidersMap = new HashMap<>();
        this.aiProvidersMap.put("OpenAi",new OpenAiProivder());
        this.aiProvidersMap.put("anthropic", new AnthropicProvider());
    }

    // /register
    // constructor reference
//    public void register(String modelName) {
//        aiProvidersMap.put(modelName,)
//    }

    static AiProviders getProviderFactory(String factoryName) {
        return aiProvidersMap.get(factoryName);
    }
}
