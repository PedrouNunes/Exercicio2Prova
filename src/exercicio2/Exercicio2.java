
package exercicio2;



/**
 *
 * @author Pedro Nunes
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder()
                    .setNome("Pedro")
                    .setIdade(19)
                    .setSexo("Masculino")
                    .setTelefone("123456789")
                    .build();
        
        
        System.out.println("");
        
        System.out.println(pessoa.toString());
    }
    
}
