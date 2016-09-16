package restauranterandom.util;

import java.util.ArrayList;
import java.util.List;
import restauranterandom.entity.Restaurante;

public class PopulaRestaurante {

    private List<Restaurante> restaurantes;

    public PopulaRestaurante() {
        restaurantes = new ArrayList<>();
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public List<Restaurante> popularRestaurantes() {
        String[] nomes = {"Varanda", "Big X Picanha", "Pizza Hut", "McLovers", "Burguer King",
        "Jeca Tatu", "Spoleto", "Belo Gourmet", "Esquina Salada", "Subway", "Dog do Negão", "Constantine",
        "Patroni", "Girafas", "Outback", "O Mineiro", "I Love Burguers", "Strike", "Applebee's"};
        Restaurante restaurante;
        for (int i = 0; i < nomes.length; i++) {
            restaurante = new Restaurante();
            restaurante.setId(i);
            restaurante.setNome(nomes[i]);
            restaurantes.add(restaurante);
        }
        return restaurantes;
    }
}
