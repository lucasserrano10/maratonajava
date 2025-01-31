package academy.devdojo.maratonajava.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "QUEBA";
    static class aninhada{
        static void print(){
            System.out.println(new OuterClassesTest03().name);
        }

    }
    public static void main(String[] args) {
        aninhada aninhada = new aninhada();
        aninhada.print();
    }
}
