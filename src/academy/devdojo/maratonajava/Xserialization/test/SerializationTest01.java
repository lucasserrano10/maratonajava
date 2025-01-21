package academy.devdojo.maratonajava.Xserialization.test;

import academy.devdojo.maratonajava.Xserialization.dominio.Aluno;
import academy.devdojo.maratonajava.Xserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Arthur Lira","2443243");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
            try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
                oos.writeObject(aluno);
                System.out.println(aluno);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
