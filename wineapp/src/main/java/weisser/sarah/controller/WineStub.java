package weisser.sarah.controller;

/**
 * Created by sarahweisser on 7/9/17.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import weisser.sarah.model.Wine;

public class WineStub {
    private static Map<Long, Wine> wines = new HashMap<Long, Wine>();
    private static Long idIndex = 3L;

    //populate initial wrecks
    static {
        Wine a = new Wine(1L, "Phillip Togni", "Cabernet", "Napa", "1996");
        wines.put(1L, a);
        Wine b = new Wine(2L, "Domaine Fevre", "Chardonnay", "Chablis", "2015");
        wines.put(2L, b);
        Wine c = new Wine(3L, "Guigal", "Condrieu", "Viognier", "2016");
        wines.put(3L, c);
    }

    public static List<Wine> list() {
        return new ArrayList<Wine>(wines.values());
    }

    public static Wine create(Wine wine) {
        idIndex += idIndex;
        wine.setId(idIndex);
        wines.put(idIndex, wine);
        return wine;
    }

    public static Wine get(Long id) {
        return wines.get(id);
    }

    public static Wine update(Long id, Wine wine) {
        wines.put(id, wine);
        return wine;
    }

    public static Wine delete(Long id) {
        return wines.remove(id);
    }
}
