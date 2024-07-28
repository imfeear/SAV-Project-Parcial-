import Sorts.SortUtils;
import Input.InputUtils;
import TratamentoArgs.args;
import SortProcessor.SortingProcessor;

//CLI -a merge -t caracteres -o AZ -in m -v 10 -s 2000
public class Main {
    public static void main(String[] args) {
        args cmdArgs = new args(args);

        //getters
        String algorithm = cmdArgs.getAlgorithm();
        String type = cmdArgs.getType();
        String order = cmdArgs.getOrder();
        String inputMethod = cmdArgs.getInputMethod();
        String values = cmdArgs.getValues();
        int pause = cmdArgs.getPause();


        //Processar os valores
        Object[] array = InputUtils.processValues(type, values, inputMethod);

        SortingProcessor.processAndSort(algorithm, array, order, pause);

    }
}
