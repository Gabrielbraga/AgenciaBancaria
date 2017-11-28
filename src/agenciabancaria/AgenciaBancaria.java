/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria;

/**
 *
 * @author gabriel.braga
 */
public class AgenciaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario g = new Gerente(52581, 37, "12345678", "Maria", 5000);
       System.out.println(g.getBonificacao());
    }
    
}
