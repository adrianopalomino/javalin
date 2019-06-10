package br.com.adrianopalomino.javalin;

import io.javalin.Javalin;

/**
 * @author adrianopalomino
 * 
 * Para testar, basta executar esta classe e acessar a url abaixo
 * http://localhost:7000/
 *
 */
public class JavalinApp {
	
	public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
    }

}
