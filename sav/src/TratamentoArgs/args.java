package TratamentoArgs;


public class args {

    String algorithm = "";
    String type = "";
    String order = "";
    String inputMethod = "";
    String values = "";
    int pause = 0;

    public args(String[] args) {
        parseArgs(args);
    }

    private void parseArgs(String[] args) {
        if (args.length == 0) {
            System.out.println("Use: a=[algoritmo] t=[tipo] o=[ordenacao] in=[entrada] v=[valores] s=[pausa]");
            return;
        }

        //iteração dentro dos argumentos para poder inserir o "=" como parametro de espaçamento
        //com limite de 2 espaços
        for (String arg : args) {
            String[] parts = arg.split("=", 2);
            if (parts.length != 2) {
                System.out.println("Formato de argumento inválido: " + arg);
                continue;
            }

            String key = parts[0].trim();
            String value = parts[1].trim();

            switch (key) {
                case "a":
                    setAlgorithm(value);
                    break;
                case "t":
                    setType(value);
                    break;
                case "o":
                    setOrder(value);
                    break;
                case "in":
                    setInputMethod(value);
                    break;
                case "v":
                    setValues(value);
                    break;
                case "s":
                    try {
                        setPause(Integer.parseInt(value));
                    } catch (NumberFormatException e) {
                        System.out.println("Valor de pausa inválido: " + value);
                    }
                    break;
                default:
                    System.out.println("Argumento desconhecido: " + key);
                    break;
            }
        }
    }



    public String getAlgorithm() {
        return algorithm;
    }

    public String getType() {
        return type;
    }

    public String getOrder() {
        return order;
    }

    public String getInputMethod() {
        return inputMethod;
    }

    public String getValues() {
        return values;
    }

    public int getPause() {
        return pause;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public void setInputMethod(String inputMethod) {
        this.inputMethod = inputMethod;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }
}
