import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Public {
	String pessoas;
    String codigo_de_cada;
    double salario_de_cada;
    String CPF_cada;
    int id_cada;
    
    public Public() {};
    
    public Public(String pessoas, String codigo_de_cada, double salario_de_cada, String CPF_cada, int id_cada) {
    	this.pessoas = pessoas;
        this.codigo_de_cada = codigo_de_cada;
        this.salario_de_cada = salario_de_cada;
        this.CPF_cada = CPF_cada;
        this.id_cada = id_cada;
    }
}

public class OrganizacaoDeGestaoFinanceira {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<Public> pub = new ArrayList<>();
        
        String pessoas = "";
        String codigo_de_cada = "";
        double salario_de_cada = 0;
    	String CPF_cada = "";
    	int id_cada = 0;
        
        while(true) {
        	System.out.println("[1] - CADASTRAR ");
            System.out.println("[2] - CODIGO ");
            System.out.println("[3] - SALARIO  ");
            System.out.println("[4] - CPFS  ");
            System.out.println("[5] - IDS ");
            System.out.println("[6] - PESSOAS ");
            System.out.println("[7] - SAIR ");
            System.out.print("Escolha: ");
            int escolher = sc.nextInt();
            
            if(escolher == 1) {
            	System.out.print(" QUANTOS? ");
                pessoas = sc.nextLine();
                System.out.println(pessoas);
                sc.nextLine();
                
                System.out.print(" QUAL O CODIGO DE CADA? ");
                codigo_de_cada = sc.nextLine();
                System.out.println(codigo_de_cada);
                sc.nextLine();
                
                System.out.print(" QUAL SALARIO DE CADA? ");
                salario_de_cada = sc.nextDouble();
                System.out.println(salario_de_cada);
                sc.nextLine();
                
                System.out.print(" CPFS: ");
                CPF_cada = sc.nextLine();
                System.out.println(CPF_cada);
                sc.nextLine();
                
                System.out.print(" IDS: ");
                id_cada = sc.nextInt();
                System.out.println(id_cada);
                
                System.out.println("======================");
                System.out.println("     DADOS SALVOS!    ");
                System.out.println("======================");
                
            }
            if(escolher == 2) {
            	System.out.println(codigo_de_cada);
            }
            if(escolher == 3) {
            	System.out.println(salario_de_cada);
            }
            if(escolher == 4) {
            	System.out.println(CPF_cada);
            }
            if(escolher == 5) {
            	System.out.println(id_cada);
            }
            if(escolher == 6) {
            	System.out.println(pessoas);
            }
            if(escolher == 7) {break;}
            
            Public is = new Public(pessoas, codigo_de_cada, salario_de_cada, CPF_cada, id_cada);
            pub.add(is);
            
            System.out.println("=====================");
            System.out.println("   RELATORIO FINAL   ");
            System.out.println("=====================");
            System.out.println("| PESSOAS: " + is.pessoas + " | ");
            System.out.println("| CDOIGO DE CADA: " + is.codigo_de_cada + " | ");
            System.out.println("| SALARIOS: " + is.salario_de_cada + " | ");
            System.out.println("| DADOS: " + is.CPF_cada + " | ");
            System.out.println("| IDS: " + is.id_cada + " | ");
        }
    }
}