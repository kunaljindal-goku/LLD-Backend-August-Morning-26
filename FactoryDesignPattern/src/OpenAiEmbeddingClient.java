public class OpenAiEmbeddingClient implements AiEmbeddingClient{
    @Override
    public void embedd(String word) {
        System.out.println("word has been embedded by OpenAI"+word);
    }
}
