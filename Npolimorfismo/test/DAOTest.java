package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImp;
import br.com.abc.javacore.Npolimorfismo.classes.DataBaseDAOImp;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
       GenericDAO arquivoDAO = new ArquivoDAOImp();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
