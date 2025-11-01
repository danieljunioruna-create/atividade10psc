public class Atividade10 {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("João Silva", 30, "123.456.789-00", "joao@email.com");
        Carro carro1 = new Carro("Fusca", "Azul", 1975);
        Animal animal1 = new Animal("Rex", "Cachorro", 5);
        Livro livro1 = new Livro("1984", "George Orwell", 1949, 328);

       
        System.out.println("=== Relacionamento: Pessoa dirigindo um Carro ===");
        pessoa1.falar(); 
        carro1.ligar(); 
        carro1.acelerar(); 
        pessoa1.andar();

        System.out.println("\n=== Relacionamento: Pessoa com Animal de estimação ===");
        pessoa1.comer(); 
        animal1.comer(); 
        animal1.emitirSom(); 

        System.out.println("\n=== Relacionamento: Pessoa lendo um Livro ===");
        pessoa1.dormir(); 
        livro1.abrir(); 
        livro1.ler(); 
        livro1.fechar(); 

       
        pessoa1.setIdade(31); 
        System.out.println("\nIdade atualizada de " + pessoa1.getNome() + ": " + pessoa1.getIdade() + " anos.");

       
        animal1.morrer(); 
        animal1.comer(); 
    }
}