public interface AiProviders {

    AiServiceClient getChatClient();
    AiEmbeddingClient getEmbeddingClient();

}
