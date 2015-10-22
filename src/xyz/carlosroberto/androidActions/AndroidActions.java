package xyz.carlosroberto.androidActions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

//@author carlos
public class AndroidActions {

    private final StringBuffer retornoDoComando;
    private final Runtime runtime;
    private Process process;

    /**
     * Método construtor Inicializa as variáveis ao chamar a classe
     */
    public AndroidActions() {

        this.retornoDoComando = new StringBuffer();
        this.runtime = Runtime.getRuntime();
        this.process = null;

    }

    /**
     * Esse método pega a resposta do comando gravada no buffer
     *
     * @return Retorna a string da resposta comando
     */
    public String getResposta() {

        if (this.retornoDoComando.length() > 0) {
            return this.retornoDoComando.toString();
        } else {
            return null;
        }

    }

    /**
     * Esse método executa o comando de sistema.
     *
     * @param cmd String com o comando de sistema
     */
    public void comando(String cmd) {

        String retorno;

        try {

            process = runtime.exec(cmd);

            try (BufferedReader saidadoProcesso = new BufferedReader(new InputStreamReader(process.getInputStream()))) {

                while ((retorno = saidadoProcesso.readLine()) != null) {
                    this.retornoDoComando.append(retorno).append("\r\n");
                }

                process.waitFor();

            } catch (InterruptedException ex) {
                Logger.getLogger(AndroidActions.class.getName()).log(Level.SEVERE, null, ex);
            }

            process.getOutputStream().close();

        } catch (IOException ex) {
            Logger.getLogger(AndroidActions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Esse método executa o comando de sistema. Caso o parâmetro resp seja
     * true, ele guarda a resposta. Se resp for false, ele somente executa o
     * comando.
     *
     * @param cmd String com o comando de sistema
     * @param resp Indica se vai processar a resposta do comando
     */
    public void comando(String cmd, boolean resp) {

        if (!resp) {

            try {

                process = runtime.exec(cmd);
                process.waitFor();

            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(AndroidActions.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            comando(cmd);
        }

    }

    /**
     * Limpa o buffer dos comandos
     */
    public void limparBuffer() {
        this.retornoDoComando.setLength(0);
    }

}
