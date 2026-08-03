public class AiClientFactory {

    public static AiServiceClient getAiClient(String modelName) {
        if(modelName.equalsIgnoreCase("openai")) {
            return new OpenAiClient();
        }
        else if(modelName=="anthopic") {
            return new AnthropicAiClient();
        }
        else if(modelName.equalsIgnoreCase("gemini")){
            return new GeminiAiClient();
        }
        throw new RuntimeException("Invalid model name");
    }
}
