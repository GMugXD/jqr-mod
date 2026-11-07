package jqrmod;

import arc.util.Log;
import jqrmod.content.world.HexBlock;
import jqrmod.content.world.LightBlockAdditive;
import mindustry.mod.ClassMap;
import mindustry.mod.Mod;

public class JQrmod extends Mod {

    public JQrmod() {
        Log.info("Loaded JQrmod constructor.");

        ClassMap.classes.put(
            "LightBlockAdditive",
            LightBlockAdditive.class
        );
        ClassMap.classes.put(
            "HexBlock",
            HexBlock.class
        );
    }

    @Override
    public void loadContent() {
        Log.info("Loading JQrmod content. Version v1");
    }
}