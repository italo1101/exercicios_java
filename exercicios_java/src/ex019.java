import java.util.Scanner;
public class ex019 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            String nomeAluno;
            double nota1, nota2, media;
    
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = input.nextLine();
    
            System.out.println("Digite a primeira nota: "); 
            nota1 = input.nextDouble();
    
            System.out.println("Digite a segunda nota: ");
            nota2 = input.nextDouble();
    
            media = (nota1 + nota2) / 2;
    
            System.out.print("O aluno " + nomeAluno + " com as notas " + nota1 + " e " + nota2 + " ficou com a media " + media);
        input.close();
    }
}