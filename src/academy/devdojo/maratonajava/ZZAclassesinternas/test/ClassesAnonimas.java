package academy.devdojo.maratonajava.ZZAclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
}



public class ClassesAnonimas {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
