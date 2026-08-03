public class AnthropicProvider implements AiProviders{
    @Override
    public AiServiceClient getChatClient() {
        return new AnthropicAiClient();
    }

    @Override
    public AiEmbeddingClient getEmbeddingClient() {
        return new AntrhopicEmbeddingClient();
    }
}
