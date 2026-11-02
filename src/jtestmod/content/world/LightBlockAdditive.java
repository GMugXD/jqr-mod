package jtestmod.content.world;

import mindustry.world.blocks.power.LightBlock;

public class LightBlockAdditive extends LightBlock {

    public LightBlockAdditive(String name) {
        super(name);

        // Default settings
        brightness = 0.9f;
        radius = 200f;
    }
}