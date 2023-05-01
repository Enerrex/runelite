package net.runelite.client.plugins.mta.telekinetic;

import net.runelite.api.coords.WorldPoint;

public class NextTilesResult
{
    public WorldPoint currentTarget = null;
    public WorldPoint[] nextTargets;

    public NextTilesResult(WorldPoint[] nextTargets) {
        if (nextTargets.length == 0) {
            this.nextTargets = new WorldPoint[0];
            return;
        }

        this.currentTarget = nextTargets[0];
        this.nextTargets = new WorldPoint[nextTargets.length - 1];
        System.arraycopy(nextTargets, 1, this.nextTargets, 0, nextTargets.length - 1);
    }
}
