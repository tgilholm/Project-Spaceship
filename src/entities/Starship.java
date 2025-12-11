package entities;


/**
 * The Starship Entity inherits base values <code>maxHealth</code>, <code>maxDefenceStrength</code>, <code>position</code> from
 * Entity. <br>Starships have the following pre-set values:
 * <pre>
 *     <code>maxAttackStrength</code>, set to 30.
 *     <code>maxDefenceStrength</code>, set to 10.
 *     <code>maxHealth</code>, set to 100.
 *     <code>maxCrew</code>, set to 10.
 * </pre>
 *
 */
public class Starship extends Entity
{
    // All Starship entities share the same base values
    private static final double maxAttackStrength = 30;
    private static final double maxDefenceStrength = 10;
    private static final double maxHealth = 100;
    private static final int maxCrew = 10;

    private final double attackStrength;
    private final int crew;
    private Starbase starbase;

    /**
     * Sets the base values for a Starship. Passes the static final maximum values to the parent constructor and sets
     * <code>attackStrength</code>, <code>crew</code> to their maximums
     * @param position the starting position of the entity
     * @param starbase the starbase this starship is docked to
     */
    public Starship(Sector position, Starbase starbase)
    {
        super(maxHealth, maxDefenceStrength, position);

        // Set values to maximum
        attackStrength = maxAttackStrength;
        crew = maxCrew;
    }
}