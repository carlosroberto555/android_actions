package xyz.carlosroberto.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

//@author carlos
public class Manipulacao {

    File arquivo;

    //Inicializa a variável ao invocar a classe
    public Manipulacao(String caminho) {

        arquivo = new File(caminho);

    }

    /**
     * Recebe uma string por parâmetro e escreve no arquivo
     *
     * @param texto String a ser escrita
     * @param modo Parâmetro pode ser w (para escrita), ou a (para append)
     */
    public void escrever(String texto, char modo) {

        boolean append = false;

        if (modo == 'a') {
            append = true;
        }

        try {

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo, append))) {
                pw.printf("%s%n", texto);
            }

        } catch (IOException e) {
            Logger.getLogger(Manipulacao.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public String ler() {

        StringBuilder texto = new StringBuilder();
        String linha;

        try {

            try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {

                while ((linha = br.readLine()) != null) {
                    texto.append(linha).append("\n");
                }

            }

        } catch (Exception e) {
            Logger.getLogger(Manipulacao.class.getName()).log(Level.SEVERE, null, e);
        }

        return texto.toString();

    }

    public void delete() {
        arquivo.delete();
    }

}
