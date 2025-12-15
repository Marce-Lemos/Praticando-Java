import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraindoHashtag {
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scan.nextLine();

        Pattern padrao = Pattern.compile("#\\w+");
        Matcher m = padrao.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (m.find()){
            hashtags.add(m.group());
        }

        if (hashtags.isEmpty()){
            System.out.println("não foram encotradas hashtags!");
        }
        else {

            System.out.println("hashtag encontrada: " + String.join(", ",hashtags));
        }


    }
}
