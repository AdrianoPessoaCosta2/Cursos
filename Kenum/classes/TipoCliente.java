package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
        return "B";
        }
    };


    //constant specific class body
    //corpo de classe especifico constante

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    private int tipo;

private String nome;


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo(int tipo, String nome ) {
        return tipo;
    }

}
