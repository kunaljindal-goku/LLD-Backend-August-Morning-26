public class AntrhopicEmbeddingClient implements AiEmbeddingClient{
    @Override
    public void embedd(String word) {
        System.out.println("This is embedding from Anthropic"+word);
    }
}
