import jade.core.Agent;
public class AgentePolinomial extends Agent {

    public void setup(){




        dataset data = new dataset();

        double [] C  = data.C;

        double[] coeficientes = {2.5, -1.3, 0.05 };


        Print imprimir= new Print();

        Polinomio Polinomio = new Polinomio();

        operaciones operaciones=new operaciones();

        Resultado resultado=new Resultado();

        Prediciones predi = new Prediciones();


      imprimir.printmatrizX();

      imprimir.printmatrizTranspuesta();

      imprimir.printResulMultiplicacion();

      imprimir.printmatrizY();

      imprimir.printResulXTY();

      imprimir.printInversa();

      imprimir.printTotal();

      imprimir.printPredicciones(data.C, coeficientes);

      //doDelete();



    }

}