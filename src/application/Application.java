package application;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");

        /*
         * Detalhes sobre a class Set, caso haja números repetidos
         * conforma esta instanciado á baixo, será descartado um dos repetidos,
         * também nesta class, não é respeitado a ordem de inserção,
         * veja a impressão = [0.0, 8.5, 3.6, 9.3, 7.0].
         *
         * passamos por paramentro  Set<Double> notas = new HashSet<>();
         * notas.addAll(Arrays.asList(7d, 8.5,9.3, 7d, 0d, 3.6));
         */
        Set<Double> notas = new HashSet<>();
        notas.addAll(Arrays.asList(7d, 8.5,9.3, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        /*
         * na class Set temos o metodo contains que retorna um boolea, se verdadeiro retorna um true, se não false;
         */
        System.out.println("Confira se a nota 5.0 está no conjunto:  " + notas.contains(5d));

        /*
         * a Class Set tem tambéme um metodo que varre a Collection e verificar o minimo e maximo
         * observe a baixo
         */
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        /*
         * Fazendo um interador para somar variaveis de uma lista;
         */
        Iterator<Double>iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        /*
         * Usado o iterator para remover dados de uma Set list;
         */
        System.out.println("Remova notas menores que 7 da lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
           Double next = iterator1.next();
           if(next < 7){
              iterator1.remove();
           }

        }System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram inseridas: ");

        /*
         * Para isto o Set não funciona como ja informado a cima, é necessário que seja feito o uso do linkedHasSet
         */
        Set<Double> notas1 = new LinkedHashSet<>();
        notas1.addAll(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 6.3));
        System.out.println(notas1.toString());

        /*
         * Exiba as notas na ordem crescente, para este feito ou fazemos por meo de um for ou fazemos uso da Api,
         * o TreeSet pode nos proporcionar este feito de uma simples forma vej a abaixo;
         * lembrando que neste caso, estamos fazendo uso da class Double, ela ja tem o metodo comparable,
         * do contrario não dará certo.
         */
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        /*
         * Limpando a lista, para tal vamos fazer o uso do metodo Clear;
         */
        System.out.println("Apague  o conjunto: ");
        notas.clear();
        System.out.println(notas.isEmpty());
        System.out.println(notas1.isEmpty());
        System.out.println(notas2.isEmpty());

    }
}
