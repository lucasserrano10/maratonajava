package academy.devdojo.maratonajava.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean boolW = true;


        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);
        System.out.println(intW2.getClass());
        System.out.println(Character.toLowerCase('E'));

    }

}
