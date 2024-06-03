import org.trabalhoPoo.implemetations.EmailManangerBuilder;
import org.trabalhoPoo.interfaces.EmailManagerInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailManagerInterface emailManager = EmailManangerBuilder.builder()
                .setUsernameAndPasswor(new Credentials())
                .Build();
        List<String> emails = List.of("lucassouza.conceicao@ucsal.edu.br", "ian.almeida@ucsal.edu.br", "lipimiranda1999@gmail.com");
        emailManager.sendSimpleEmailToMany(emails, "Teste", "Teste de envio de email");
    }
}