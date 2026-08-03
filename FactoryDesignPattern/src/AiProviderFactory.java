public class AiProviderFactory {

    static AiProviders getProviderFactory(String factoryName) {
        if(factoryName.equalsIgnoreCase("openai")) {
            return new OpenAiProivder();
        }
        throw new RuntimeException("Invalid input");
    }
}
