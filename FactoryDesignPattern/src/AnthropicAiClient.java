public class AnthropicAiClient implements AiServiceClient{

    public String giveResponse(String prompt) {
        return "This is a Anthropic response"+prompt;
    }

    @Override
    public String complete(String prompt) {
        return giveResponse(prompt);
    }
}
