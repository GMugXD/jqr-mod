package jtestmod;

import arc.util.Log;
import jtestmod.content.world.LightBlockAdditive;
import mindustry.mod.ClassMap;
import mindustry.mod.Mod;

public class JTestMod extends Mod {

    public JTestMod() {
        Log.info("Loaded JTestMod constructor.");

        ClassMap.classes.put(
            "LightBlockAdditive",
            LightBlockAdditive.class
        );
    }

    @Override
    public void loadContent() {
        Log.info("Loading some example content.");
    }
}