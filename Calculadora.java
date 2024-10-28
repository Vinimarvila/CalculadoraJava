public class Calculadora {
    private int num1;
    private int num2;

    // Construtor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters e Setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Métodos para operações
    public int some() {
        return num1 + num2;
    }

    public int subtraia() {
        return num1 - num2;
    }

    public int divida() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0; // Retorna 0 para evitar erro de divisão por zero
        }
    }

    public int multiplique() {
        return num1 * num2;
    }
}