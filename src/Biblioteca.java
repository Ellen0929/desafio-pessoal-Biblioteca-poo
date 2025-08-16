import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }

    public void  adicionarLivro(Livro livro){
        if(livro != null){
            livros.add(livro);
        }
    }

    public void emprestarLivro(String titulo){
        if(titulo == null){
            System.out.println("Erro: Esse livro não está disponível!");
            return;
        }
        for(Livro l : livros){
            if(l != null && l.getTitulo() != null && l.getTitulo().equalsIgnoreCase(titulo)){
                l.emprestar();
                return;
            }
        }
        System.out.println("Livro foi encontrado: " +titulo);
    }

    public void devolverLivro(String titulo){
        if(titulo ==null){
            System.out.println("Erro: título não pode ser nulo!");
            return;
        }
        for(Livro l :livros){
            if(l != null && l.getTitulo() != null && l.getTitulo().equalsIgnoreCase(titulo)){
                l.devolver();
                return;
            }
        }
        System.out.println("Livro devolvido: " +titulo);
    }

    public void buscarLivro(String titulo) {
        if (titulo == null) {
            System.out.println("Erro: título não pode ser nulo!");
            return;
        }

        boolean encontrado = false;
        for (Livro l : livros) {
            if (l != null && l.getTitulo() != null && l.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("Encontrado: " + l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("livro encontrado  " + titulo);
        }
    }

    public void recomendarLivros(String palavraChave){
        if(palavraChave ==null){
            System.out.println("Erro: palavra-chave não pode ser nula!");
            return;
        }
        System.out.println("Recomendação de LLM baseada em '" +palavraChave + "': ");
        System.out.println("Sugestão: 'Effective Java' - Joshua Boch");
    }
  }
