public class Main {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[2];
        f[0] = new Gerente(3000);
        f[1] = new OperaDiarista(10, 5);
        
        f[0].setCodigo(20);
        f[0].setNome("Luiz");

        f[1].setCodigo(90);
        f[1].setNome("Humberto");


        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].toString());
        
        }
        
    }
}
