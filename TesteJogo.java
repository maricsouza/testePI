import java.util.Scanner;

public class TesteJogo {


    public static void main(String[]args) {

        String tes1 [] = {"Quanto e 1+1?", "Quanto e 1+2?", "Quanto e 1+3?"};
        String test2[][] = {{"02", "01", "11", "15"},
                            {"03", "10", "33", "10"},
                            {"20","30","04","20"}};
        String cert[] = {"02", "03", "04"};


        int num = 0;
        int col = test2.length;

        do {

            int certo = 0;
            int errado = 0;
            
            boolean d = certoErrado(tes1, test2, cert, num);
             if (d == true)
                certo++;
             else
                errado++;
          
           
            System.out.println("Resposta certa: " + certo);
            System.out.println("Resposta errada: " + errado);
            num++;
        
        } while ( num != col );
    
        
    

    }

    public static void perguntasRespostas (String perg[], String resp[][], int num) {
        
        System.out.println(perg[num]);

        int linha = resp[num].length;

        for (int i = 0; i < num; i++) {
            for ( int j = 0; j < linha; j++){
                System.out.println((j + 1) + ". " + resp[i][j]);
            }
        }
    }

    public static boolean certoErrado (String perg[], String resp[][], String rcert[], int num) {

        Scanner sc = new Scanner(System.in);
        int linha = resp[num].length;
        String ce = rcert[num];



        perguntasRespostas(perg, resp, num);
        System.out.println("Escolha sua resposta de 1 a " + linha);
        int resposta = sc.nextInt();
        String rpessoa = resp[num][resposta-1];

        sc.close();

        return rpessoa == ce;
    }


}

