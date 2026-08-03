import java.nio.file.Path;
import java.util.List;

public class ChatService {

//    private OpenAiClient openAiClient;
//    private AnthropicAiClient anthropicAiClient;

    private AiServiceClient aiServiceClient;
    private AiEmbeddingClient aiEmbeddingClient;
    private AiProviders aiProviders;

    public ChatService(String modelName) {
//        for(String modelName: modelNames) {
//            try {
//                this.aiProviders = AiProviderFactory.getProviderFactory(modelName);
//            }
//            catch (Exception e) {
//                System.out.println(modelName + " is not available. Trying for second model");
//            }
//        }
//        if(aiProviders==null) {
//            throw new RuntimeException("Please try after some time");
//        }
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
