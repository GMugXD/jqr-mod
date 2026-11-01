package jtestmod.content;

import arc.Events;
import arc.util.Log;
import jtestmod.content.world.LightBlockAdditive;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.ClassMap;
import mindustry.mod.Mod;

public class JTestMod extends Mod{

    public JTestMod(){
        Log.info("Loaded JTestMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            ClassMap.classes.put("LightBlockAdditive", LightBlockAdditive.class);
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}