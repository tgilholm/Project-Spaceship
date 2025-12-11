package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * The Fleet object serves to associate player ownership with a group of Entities
 * It holds a <code>Player</code> value and a <code>List</code> of <code>Entity</code> objects,
 * comprising both Starbases and Starships
 */
public class Fleet
{
    private final Player player;
    private final List<Entity> entityList;

    /**
     * Sets the base values for a Fleet and initialises the <code>entityList</code>
     * @param player the Player who owns this Fleet
     */
    public Fleet(Player player)
    {
        this.player = player;
        entityList = new ArrayList<>();
    }
}
