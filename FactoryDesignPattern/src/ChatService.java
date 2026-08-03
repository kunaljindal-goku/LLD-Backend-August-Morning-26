public class ChatService {

//    private OpenAiClient openAiClient;
//    private AnthropicAiClient anthropicAiClient;

    private AiServiceClient aiServiceClient;
    private AiEmbeddingClient aiEmbeddingClient;
    private AiProviders aiProviders;

    public ChatService(String modelName) {
        AiProviders aiProviders = AiProviderFactory.getProviderFactory(modelName);
        this.aiServiceClient = aiProviders.getChatClient();
        this.aiEmbeddingClient = aiProviders.getEmbeddingClient();
    }

    public void complete(String prompt) {
//        if (type == "openai") {
//            System.out.println(openAiClient.chat(prompt));
//        } else if (type == "anthropic") {
//            System.out.println(anthropicAiClient.giveResponse(prompt));
//        }
        System.out.println(aiServiceClient.complete(prompt));
    }
}
