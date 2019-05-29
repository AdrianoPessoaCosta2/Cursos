package br.com.abc.javacore.Npolimorfismo.classes;

public class DataBaseDAOImp implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");

    }
}
