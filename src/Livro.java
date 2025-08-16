public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String javaBásico, String autorA, int i) {
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public void emprestar() {
        if (disponivel){
            disponivel = false;
            System.out.println("Livro emprestado: " + titulo);
        }else{
            System.out.println("Livro já está emprestado: " +titulo);
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido: " +titulo);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", disponivel=" + disponivel +
                '}';
    }
}
