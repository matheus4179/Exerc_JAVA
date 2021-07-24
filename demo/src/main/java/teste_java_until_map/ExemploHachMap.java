package teste_java_until_map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHachMap {


    public static void main(String[] args) {
        Map<String, Integer> campeosMundialFifa = new HashMap<>();

        //adicionando os campeões da fifa no código

        campeosMundialFifa.put("Brasil", 4);
        campeosMundialFifa.put("Italia", 4);
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("França", 5);

        System.out.println(campeosMundialFifa);

        //atualizar o valor da chave Brasil
        campeosMundialFifa.put("Brasil", 5);

        System.out.println(campeosMundialFifa);

        //retornar a alemanaha
        System.out.println(campeosMundialFifa.get("Alemanha"));

        //retorna se exite ou não campeão França
        System.out.println(campeosMundialFifa.containsKey("França"));

        //exluir a França
        campeosMundialFifa.remove("França");

        //retorna se existe a França
        System.out.println(campeosMundialFifa.containsKey("França"));

        //retorna se existe alguma seleção campeã 5 vezes
        System.out.println(campeosMundialFifa.containsValue(5));

        //retorna o tamanho do mapa
        System.out.println(campeosMundialFifa.size());

        System.out.println("teste-->" +campeosMundialFifa);

        for (Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()){
            System.out.println(entry.getKey() +"-"+ entry.getValue());
        }

        for (String lista :campeosMundialFifa.keySet()){
            System.out.println(lista +"--" + campeosMundialFifa.get(lista));
        }

        //limpar mapa
        campeosMundialFifa.clear();

        //contar o mapa
        System.out.println(campeosMundialFifa.size());
    }
}