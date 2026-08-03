public class OpenAiClient implements AiServiceClient{

    public String chat(String prompt) {
        return "This is a ChatGpt response for: "+prompt;
    }

    @Override
    public String complete(String prompt) {
        return chat(prompt);
    }
}
