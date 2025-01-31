package academy.devdojo.maratonajava.ZZAclassesinternas.test;

//Classes Internas

public class OuterClassesTest01 {
    private String nome = "Neymar";


    class InnerClasses {
        public void printOuterClassAtrribute(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        InnerClasses inner = outerClass.new InnerClasses();
        inner.printOuterClassAtrribute();

    }
}
