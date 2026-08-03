public class AiEmbeddingClientFactory {

    public static AiEmbeddingClient getEmbeddingClient(String clientName) {
        if(clientName.equalsIgnoreCase("openai")) {
            return new OpenAiEmbeddingClient();
        }
        else if(clientName.equalsIgnoreCase("antrhopic")) {
            return new AntrhopicEmbeddingClient();
        }
        throw new RuntimeException("Invalid client name");
    }
}
