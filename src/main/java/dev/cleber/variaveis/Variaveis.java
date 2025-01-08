package dev.cleber.variaveis;

import java.util.*;
/*String, se for usar um dado o qual nao será feito nenhum calculo com ele - CPF*/

public class Variaveis {
    public static void main(String[] args) {

        int numero1, numero2, numero3;

        numero1 = 10;
        numero2 = 20;
        numero3 = 30;
        int resultadoNumeros = numero1 + numero2 + numero3;

        int idade;
        String nome;
        idade = 49;
        nome = "Cleber";

        /* suporta numeros maiores de float */
        double altura = 1.87;

        /* suporta numeros menores que double */
        float pi = 3.14f;

        /* boolean para verdadeiro ou falso */
        boolean ativo = true;

        /* char para indicar masculino ou feminino, por exemplo */
        char genero = 'M';

        System.out.println("Resultado nas variaveis de numeros é " + resultadoNumeros);
        System.out.println(nome + " tem " + idade + " anos de idade." + " mede " + altura);
        System.out.println("PI " + pi);
        System.out.println("Genero: " + genero);
        System.out.println("O usuário " + nome + " é um usuario ativo? " + ativo);

        if (!ativo == false) {
            System.out.println("SIM, O USÁRIO ESTÁ ATIVO");

        } else {
            System.out.println("O USUARIO NAO ESTÁ ATIVO.");

        }
        /*chamar metodos*/
        calculadoraDeIdade();
        //calcularIMC();
        calculoDeIdade();
    }

    /*CALCULAR A IDADE*/

    private static void calculadoraDeIdade() {
        int anoAtual = 2024;
        int anoNascimento = 1974;
        int minhaIdade = anoAtual - anoNascimento;

        System.out.println("Calculando a minha idade eu tenho " + minhaIdade + " anos de idade");
    }

    /*CALCULAR O IMC*/

    private static void calcularIMC() {
        /* peso dividido (altura * altura) */

        float peso = 0;
        float altura = 0;

        float imc = peso / (altura * altura);

        String classificacao =

                imc < 18.5 ? "Magreza"
                        : imc >= 18.5 && imc <= 24.9 ? "Normal"
                        : imc >= 25.0 && imc <= 29.9 ? "Sobrepeso"
                        : imc >= 30.0 && imc <= 39.9 ? "Obesidade" : "Obesidade Grave";

        Scanner digitarValores = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = digitarValores.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = digitarValores.nextFloat();

        float imcScanner = peso / (altura * altura);

        System.out.println("Se o seu peso é " + peso + " e sua altura for " + altura + " o IMC é :" + imcScanner
                + " e seu estado é de " + classificacao);

        digitarValores.close();



        /* IMC
         * Menor que 18,5: Magreza Entre 18,5 e 24,9: Normal Entre 25,0 e 29,9:
         * Sobrepeso Entre 30,0 e 39,9: Obesidade Maior que 40,0: Obesidade Grave
         */
    }

    /*calculando a idade com scanner*/
    private static void calculoDeIdade() {    	
    	
    	int anoNascimento = 0;
    	int anoAtual = 0;
    	
    	Scanner calculoDeIdade = new Scanner(System.in);
    	System.out.println("Digite seu ano de nascimento : ");
        anoNascimento = calculoDeIdade.nextInt();
        System.out.println("digite o ano alvo:");
        anoAtual = calculoDeIdade.nextInt();
        
        int idade = anoAtual - anoNascimento;
               

        System.out.println("O metodo calcularDeIdade() diz que voce tem " + idade + " anos de idade.");
        calculoDeIdade.close();
        
    }
}
