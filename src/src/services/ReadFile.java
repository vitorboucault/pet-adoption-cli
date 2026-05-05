package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public void readForm() {
        File file = new File("/Users/vbcripto/repositorios/pet-adoption-cli/formulario/formulario.txt");

        try (FileReader fw = new FileReader(file)){
            BufferedReader br = new BufferedReader(fw);

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
