public class Acao {
   
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Daniel junior", 18, "000.000.000-00", "danieljunior.@example.com");
        p.andar();
        p.falar();

        Animal a = new Animal("Cão", 3, "caramelo", 12.5);
        a.emitirSom();
        a.correr();

        Carro car = new Carro("Chevrolet ", "Classic", "zinza escuro", "ABC-6826");
        car.ligar();
        car.acelerar();

        Celular cel = new Celular("xiaome ", "17 pro", "6.2\"", "preto");
        cel.ligar();
        cel.tirarFoto();

        Computador pc = new Computador(" rtx 4050 ", 8, 512, "Linux");
        pc.ligar();
        pc.rodarPrograma("Calculadora");

        Livro livro = new Livro("diario de uma banana", "Jeff Kinney", "Comedia", 96);
        livro.abrir();
        livro.lerPagina(5);

        Escola escola = new Escola("Escola", "Rua dos angelis, 21", 10, "Ronaldo");
        escola.ensinar();
        escola.realizarProvas();

        Televisao tv = new Televisao("xiaomi", "89\"", "4K", "Preto");
        tv.ligar();
        tv.trocarCanal(7);

        Relogio rel = new Relogio("Rolex Cosmograph Daytona", "Analogico", "Dourado", "Ouro");
        rel.mostrarHora();
        rel.despertar();

        Bicicleta bike = new Bicicleta("Gts Fat Bike", "Branco/Laranja", 40, "top");
        bike.pedalar();
        bike.frear();
    }

    //pessoa 
    static class Pessoa {
        private String nome;
        private int idade;
        private String cpf;
        private String email;

        public Pessoa(String nome, int idade, String cpf, String email) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.email = email;
        }

        public void andar() {
            System.out.println(nome + " está caminhando.");
        }

        public void comer() {
            System.out.println(nome + " está Degustando.");
        }

        public void dormir() {
            System.out.println(nome + " está dormindo.");
        }

        public void falar() {
            System.out.println(nome + " está falando.");
        }
    }

    //Animsl <3
    static class Animal {
        private String especie;
        private int idade;
        private String cor;
        private double peso;
        
        public Animal(String especie, int idade, String cor, double peso) {
            this.especie = especie;
            this.idade = idade;
            this.cor = cor;
            this.peso = peso;
        }

        public void comer() {
            System.out.println(especie + " está comendo.");
        }

        public void dormir() {
            System.out.println(especie + " está dormindo.");
        }

        public void correr() {
            System.out.println(especie + " está correndo.");
        }

        public void emitirSom() {
            System.out.println(especie + " está emitindo som.");
        }
    }

    //carro
    static class Carro {
        private String marca;
        private String modelo;
        private String cor;
        private String placa;

        public Carro(String marca, String modelo, String cor, String placa) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.placa = placa;
        }

        public void ligar() {
            System.out.println(marca + " " + modelo + " ligado.");
        }

        public void desligar() {
            System.out.println(marca + " " + modelo + " desligado.");
        }

        public void acelerar() {
            System.out.println(marca + " " + modelo + " correndo.");
        }

        public void frear() {
            System.out.println(marca + " " + modelo + " desacelerando.");
        }
    }

    //telefone 
    static class Celular {
        private String marca;
        private String modelo;
        private String tamanhoTela;
        private String cor;

        public Celular(String marca, String modelo, String tamanhoTela, String cor) {
            this.marca = marca;
            this.modelo = modelo;
            this.tamanhoTela = tamanhoTela;
            this.cor = cor;
        }

        public void ligar() {
            System.out.println("Celular " + marca + " ligado.");
        }

        public void tirarFoto() {
            System.out.println("Celular " + marca + " tirou uma foto.");
        }

        public void enviarMensagem(String texto) {
            System.out.println("Enviando mensagem: " + texto);
        }

        public void fazerLigacao(String numero) {
            System.out.println("Chamando " + numero + "...");
        }
    }

    //computador 
    static class Computador {
        private String processador;
        private int memoriaRAM; // GB
        private int armazenamento; // GB
        private String sistemaOperacional;

        public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional) {
            this.processador = processador;
            this.memoriaRAM = memoriaRAM;
            this.armazenamento = armazenamento;
            this.sistemaOperacional = sistemaOperacional;
        }

        public void ligar() {
            System.out.println("Computador com " + processador + " ligado.");
        }

        public void desligar() {
            System.out.println("Computador desligando.");
        }

        public void rodarPrograma(String nomePrograma) {
            System.out.println("Rodando o programa: " + nomePrograma);
        }

        public void atualizar() {
            System.out.println("Atualizando " + sistemaOperacional);
        }
    }

    //livro
    static class Livro {
        private String titulo;
        private String autor;
        private String genero;
        private int numeroDePaginas;

        public Livro(String titulo, String autor, String genero, int numeroDePaginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.numeroDePaginas = numeroDePaginas;
        }

        public void abrir() {
            System.out.println("Abrindo o livro: " + titulo);
        }

        public void lerPagina(int pagina) {
            System.out.println("Lendo a página " + pagina + " de " + titulo);
        }

        public void fechar() {
            System.out.println("Fechando o livro: " + titulo);
        }

        public void marcarPagina(int pagina) {
            System.out.println("Marcando a página " + pagina + " no livro: " + titulo);
        }
    }

    //escola 
    static class Escola {
        private String nome;
        private String endereco;
        private int numeroDeSalas;
        private String diretora;

        public Escola(String nome, String endereco, int numeroDeSalas, String diretora) {
            this.nome = nome;
            this.endereco = endereco;
            this.numeroDeSalas = numeroDeSalas;
            this.diretora = diretora;
        }

        public void ensinar() {
            System.out.println(nome + " está ensinando os alunos.");
        }

        public void realizarProvas() {
            System.out.println(nome + " está realizando provas.");
        }

        public void organizarEventos() {
            System.out.println(nome + " está organizando um evento.");
        }

        public void receberAlunos() {
            System.out.println(nome + " está recebendo alunos.");
        }
    }

    //  Televisão
    static class Televisao {
        private String marca;
        private String tamanho;
        private String resolucao;
        private String cor;

        public Televisao(String marca, String tamanho, String resolucao, String cor) {
            this.marca = marca;
            this.tamanho = tamanho;
            this.resolucao = resolucao;
            this.cor = cor;
        }

        public void ligar() {
            System.out.println("Televisão " + marca + " ligada.");
        }

        public void desligar() {
            System.out.println("Televisão " + marca + " desligada.");
        }

        public void trocarCanal(int canal) {
            System.out.println("Trocando para o canal " + canal);
        }

        public void aumentarVolume() {
            System.out.println("Aumentando volume da TV " + marca);
        }
    }

    //  Relógio
    static class Relogio {
        private String marca;
        private String tipo; // analógico ou digital
        private String cor;
        private String materialPulseira;

        public Relogio(String marca, String tipo, String cor, String materialPulseira) {
            this.marca = marca;
            this.tipo = tipo;
            this.cor = cor;
            this.materialPulseira = materialPulseira;
        }

        public void mostrarHora() {
            System.out.println("Mostrando a hora no relógio " + marca);
        }

        public void despertar() {
            System.out.println("O relógio " + marca + " está despertando.");
        }

        public void cronometrar() {
            System.out.println("Cronômetro iniciado no relógio " + marca);
        }

        public void ajustarHora(int hora, int minuto) {
            System.out.println("Hora ajustada para " + hora + ":" + String.format("%02d", minuto));
        }
    }

    //  Bicicleta
    static class Bicicleta {
        private String marca;
        private String cor;
        private int numeroDeMarchas;
        private String tipo; // MTB, Speed etc.

        public Bicicleta(String marca, String cor, int numeroDeMarchas, String tipo) {
            this.marca = marca;
            this.cor = cor;
            this.numeroDeMarchas = numeroDeMarchas;
            this.tipo = tipo;
        }

        public void pedalar() {
            System.out.println("Pedalando a bicicleta " + marca);
        }

        public void frear() {
            System.out.println("Freando a bicicleta " + marca);
        }

        public void virar(String direcao) {
            System.out.println("Virando para a " + direcao);
        }

        public void estacionar() {
            System.out.println("Bicicleta " + marca + " estacionada.");
        }
    }
}