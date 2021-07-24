package teste_java_until_map;

import javax.sql.rowset.spi.SyncResolver;
import java.awt.*;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String > treeCapitais = new TreeMap<>();

        //montar a arvore das capitais
        treeCapitais.put("SP", "Sao Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("AL", "Maceio");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //retornar a primeira captal no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //retornar a ultima captal no final da arvore
        System.out.println(treeCapitais.lastKey());

        //retornar a primeira captal abaixo da key indicada
        System.out.println(treeCapitais.lowerKey("MG"));

        //retornar a primeira captal abaixo da key indicada
        System.out.println(treeCapitais.higherKey("AL"));

        //retorna a primeira captal no topo da tree
        System.out.println(treeCapitais.firstEntry().getKey() +"-"+ treeCapitais.firstEntry().getValue());

        //retorna a ultima captal no topo da tree
        System.out.println(treeCapitais.lastEntry().getKey() +"-"+ treeCapitais.lastEntry().getValue());
    }
}
