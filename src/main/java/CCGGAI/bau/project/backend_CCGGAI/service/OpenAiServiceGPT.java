package CCGGAI.bau.project.backend_CCGGAI.service;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAiServiceGPT {

    private final OpenAiService openAiService;

    public OpenAiServiceGPT(@Value("${openai.api.key}") String apiKey) {
        this.openAiService = new OpenAiService(apiKey);
    }

    public String generateDescription(String productName, String category) {
        String prompt = "Ürün adı: " + productName + "\nKategori: " + category +
                        "\nBu ürün için özgün, açıklayıcı ve kısa bir açıklama üret:";

        CompletionRequest request = CompletionRequest.builder()
                .prompt(prompt)
                .model("text-davinci-003")
                .maxTokens(100)
                .temperature(0.7)
                .build();

        return openAiService.createCompletion(request)
                .getChoices()
                .get(0)
                .getText()
                .trim();
    }
}
