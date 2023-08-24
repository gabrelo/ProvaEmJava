import java.util.Locale;
import java.util.Scanner;

public class ProvaBleach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int numPerguntas = 10;
        int pontoQuestao = 1;
        char[] gabarito ={'c', 'c', 'd', 'b', 'a', 'a', 'd', 'a', 'b', 'b'};
        String[] perguntas = {
                "Qual a Quincy com poderes de Zumbi?",
                "Qual Espada o Ichigo derrotou?",
                "Quem é o Espada mais forte?",
                "Quem é o Quincy mais forte?",
                "Qual capitão morre na saga dos Quincys?",
                "Qual o nome do pai do Ishida?",
                "Qual o nome da zanpakutou do Aizen?",
                "Qual personagem não mostrou sua bankai?",
                "Quem é o primeiro a morrer na Saga Quincy?",
                "Qual personagem entra na sala do trono junto com Ichigo na luta final?",
        };
        String[] alternativas = {
                "a)Candice | b)Bambietta | c) Giselle | d) Meninas",
                "a)Szayel| b)Nnoitra | c) Grimmjow | d) Barrangan",
                "a)Grimmjow | b)Ulquiorra | c) Halibel| d) Starrk",
                "a)Gerard | b)Haschwalt | c) Gremmy | d) Askin",
                "a)Unohana | b)Zaraki | c) Shunsui | d) Mayuri",
                "a)Ryuken | b)Ishin| c) Acuttrone | d) Pernidas",
                "a)Katen Kyōkotsu | b)Sōgyo no Kotowari | c) Sakanade| d)  Kyoka Suigetsu",
                "a)Hisagi | b)Tousen | c) Komamura | d) Rose",
                "a)Iba | b)Sasakibe | c) Kira | d) Ikkaku",
                "a)Rukia | b)Inoue | c) Aizen | d) Renji",
        };
        char[] respostas = new char[numPerguntas];
        char resp;
        int nota = 0;
        String aluno;

        System.out.println("Digite seu nome: ");
        aluno = sc.nextLine();
        for (int i=0; i<numPerguntas;i++){
            System.out.println("--------------------------------");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=sc.nextLine().charAt(0);
            respostas[i]=resp;
        }

        System.out.printf("%s%n", "Fim da prova, confira o resultado");
        for (int i=0; i<numPerguntas; i++){
            if (gabarito[i] == respostas[i]){
                nota +=pontoQuestao;
            }
        }
        System.out.printf("%s sua nota foi %d, você foi %s", aluno, nota, nota>=6?"aprovado!!":"reprovado!!");

        sc.close();
    }
}
