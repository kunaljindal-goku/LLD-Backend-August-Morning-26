public class GeminiAiClient implements AiServiceClient{
    @Override
    public String complete(String prompt) {
        return "THis is a response from Gemini";
    }
}
