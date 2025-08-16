public class Main {
    public static void main (String []args){
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Java Básico","Autor A",2020));
        biblioteca.adicionarLivro(new Livro("Spring Boot","Autor B",2022));
        biblioteca.adicionarLivro(new Livro("POO em Java","Autor C",2025));

        //Buscar livros (palavra-chave)
        System.out.println("Buscando livros com 'Java': ");
        biblioteca.buscarLivro("Java");

        System.out.println("==============================");

        //Emprestar livro
        System.out.println("Emprestando 'Java Básico': ");
        biblioteca.emprestarLivro("Java Básico");

        System.out.println("==============================");

        //tentar emprestar de novo
        System.out.println("Tentando emprestar 'Java Básico' novamente: ");
        biblioteca.emprestarLivro(null);

        System.out.println("==============================");

        //devolver livro
        System.out.println("Devolvendo 'Java Básico': ");
        biblioteca.devolverLivro("Java Básico");

        System.out.println("==============================");

        //Buscar livro exato
        System.out.println("Buscando livro exato de 'POO em Java': ");
        biblioteca.buscarLivro("POO em Java");

        System.out.println("==============================");

        //Simulação de recomendação com LLM
        System.out.println("Sugestão  ");
        biblioteca.recomendarLivros("Java");
    }
}
