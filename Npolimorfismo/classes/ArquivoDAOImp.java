package br.com.abc.javacore.Npolimorfismo.classes;

public class ArquivoDAOImp implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos Arquivos");
    }
}
