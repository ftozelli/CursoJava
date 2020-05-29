public class Livro{
    private String  titulo, autor, categoria;
    private boolean emprestimo, avaria;
    private int     anoPublic, posicaoE, posicaoP;

    public Livro(String tit, String aut, String cat, int ano, int pe, int pp){
        this.titulo     = tit;
        this.autor      = aut;
        this.categoria  = cat;
        this.anoPublic  = ano;
        this.posicaoE   = pe;
        this.posicaoP   = pp;
        this.emprestimo = false;
        this.avaria     = false;
    }

    public void setTitulo(String novotitulo){
        this.titulo = novotitulo;
    }
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    public void setCategoria(String novaCategoria){
        this.categoria = novaCategoria;
    }
    public void setAno(int novoAno){
        this.anoPublic = novoAno;
    }
    public void setPosicaoE(int novoPosicaoE){
        this.posicaoE = novoPosicaoE;
    }
    public void setPosicaoP(int novoPosicaoP){
        this.posicaoP = novoPosicaoP;
    }
    public void setEmprestimo(boolean novoEmprestimo){
        this.emprestimo = novoEmprestimo;
    }
    public void setAvaria(boolean novaAvaria){
        this.avaria = novaAvaria;
    }


    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public int getAno(){
        return this.anoPublic;
    }
    public int getPosicaoE(){
        return this.posicaoE;
    }
    public int getPosicaoP(){
        return this.posicaoP;
    }
    public boolean isEmprestimo(){
        return this.emprestimo;
    }
    public boolean isAvaria(){
        return this.avaria;
    }

    void emprestar(){
        if (!emprestimo){
            this.emprestimo = true;
            System.out.println("Livro " + this.titulo + " alugado.");
        }
        else{
            this.emprestimo = false;
            System.out.println("Livro " + this.titulo + " devolvido.");
        }
    }

    void avariado(){
        if (!avaria){
            this.avaria = true;
            System.out.println("Livro " + this.titulo + " com avarias");
        }
        else{
            this.avaria = false;
            System.out.println("Livro " + this.titulo + " sem avarias");
        }
    }

    void consulta(){
        System.out.printf("Titulo: " + this.titulo + "\n");
        System.out.printf("Autor: " + this.autor + "\n");
        System.out.printf("Categoria: " + this.categoria + "\n");
        System.out.printf("Ano de Publicacao: " + this.anoPublic + "\n");
        System.out.printf("Estante: " + this.posicaoE + "\n");
        System.out.printf("Prateleira: " + this.posicaoP + "\n");
        if (avaria){
            System.out.printf("Livro alugado\n");
        }
        else{
            System.out.printf("Livro disponivel\n");
        }

        if (avaria){
            System.out.printf("Livro com avarias\n");
        }
        else{
            System.out.printf("Livro sem avarias\n");
        }
    }
}