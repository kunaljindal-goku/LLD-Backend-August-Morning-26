public class OpenAiProivder implements AiProviders{
    @Override
    public AiServiceClient getChatClient() {
        return new OpenAiClient();
    }

    @Override
    public AiEmbeddingClient getEmbeddingClient() {
        return new OpenAiEmbeddingClient();
    }
}
