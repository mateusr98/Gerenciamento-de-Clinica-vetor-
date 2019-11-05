package Gerenciador_Clinica;

import java.util.Scanner;

public class Gerenciador_Clinica {

    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        char op;
        String diag[] = new String [5];
        String nomeMed[] = new String [5];
        String endMed[] = new String [5];
        String endPac[] = new String [5];
        String nomePac[] = new String [5];
        int menu, codMe,med,dataPesq;
        int idade[] = new int [5];
        double salMed [] = new double [5];
        int nPront[] = new int [5];
        int dataConsu[] = new int [5];
        int codPac[] = new int [5];
        int codMed[] = new int [5];
        menu = 1;

        while ((menu>=1)&&(menu<=5)){
            System.out.println("Menu:");
            System.out.println("1 para gerenciar pacientes");
            System.out.println("2 para gerenciar medicos");
            System.out.println("3 para gerenciar consultas");
            System.out.println("4 para excluir algum medico");
            System.out.println("5 para mostrar as consultas realizadas");
            System.out.println("6 para sair");
            menu = Leia.nextInt();

            if (menu == 1) { //menu de cadastro de pacientes
                do {
                    System.out.println("digite o cod do paciente");
                    codPac[5] = Leia.nextInt();
                    System.out.println("digite o nome do paciente:");
                    nomePac[5] = Leia.next();
                    System.out.println("digite o endereço:");
                    endPac[5] = Leia.next();
                    System.out.println("digite a idade do paciente:");
                    idade[5] = Leia.nextInt();

                    System.out.println("deseja cadastrar outro paciente? s ou n?");
                    op = Leia.next().charAt(0);
                } while (op == 's');
            }

            if (menu == 2) { //menu de cadastro de medicos
                do {
                    System.out.println("digite o cod do medico");
                    codMed[5] = Leia.nextInt();
                    System.out.println("digite o nome do medico");
                    nomeMed[5] = Leia.next();
                    System.out.println("digite o endereço do medico");
                    endMed[5] = Leia.next();
                    System.out.println("digite o salario do medico");
                    salMed[5] = Leia.nextDouble();

                    System.out.println("deseja cadastrar outro medico? s ou n?");
                    op = Leia.next().charAt(0);
                } while (op == 's');
            }

            if (menu == 3) { //menu de cadastro de consultas
                do {
                    System.out.println("digite o numero do prontuario");
                    nPront[5] = Leia.nextInt();
                    System.out.println("digite a data da consulta");
                    dataConsu[5] = Leia.nextInt();
                    System.out.println("digite o diagnostico");
                    diag[5] = Leia.next();
                    System.out.println("digite o codigo do medico");

                    System.out.println("deseja cadastrar outra consulta? s ou n?");
                    op = Leia.next().charAt(0);
                } while (op == 's');
            }
            if (menu == 4) { //menu para exclusão de medicos
                do {
                    System.out.println("digite o cod do medico q deseja excluir");
                    codMe = Leia.nextInt();
                    for (int i = 0; i < 5; i++) {
                        if (codMed[i] == codMe) {
                     codMed[i] = 0;
                     nomeMed[i]= null;
                     endMed[i]=null;
                     salMed[i]=0;
                    }    
                    }

                    System.out.println("deseja excluir mais algum medico? s ou n?");
                    op = Leia.next().charAt(0);
                } while (op == 's');

            }
            if (menu == 5) { //menu para pesquisa de consultas
                do {
                    System.out.println("digite a data das consultas para pesquisa");
                    dataPesq = Leia.nextInt();
                    for (int i = 0; i < 5; i++) {
                        if (dataPesq == dataConsu[i]) {
                            System.out.println("Prontuario n° "+nPront[i]);
                            System.out.println("Data de consulta: "+dataConsu[i]);
                            System.out.println("Diagnostico: "+diag[i]);
                            System.out.println("cod do medico: "+codMed[i]);
                            System.out.println("cod do paciente: "+codPac[i]);
                        }
                    }

                    System.out.println("deseja pesquisar mais alguma consulta? s ou n?");
                    op = Leia.next().charAt(0);
                } while (op == 's');
            }
        }
    }
}
