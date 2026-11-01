package jtestmod.content.world;

import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.annotations.Annotations.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.logic.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.Vars.*;
import arc.graphics.Blending;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Draw.color;
import arc.util.Tmp;
import mindustry.logic.LAccess.efficiency;
import mindustry.world.blocks.power.LightBlock;

public class LightBlockAdditive extends LightBlock{
    public LightBlockAdditive(String name){
        super(name);
    }
        @Override
        public void draw(){
            Draw.blend(Blending.additive);
            Draw.color(Tmp.c1.set(color), efficiency * 0.3f);
            Draw.rect(topRegion, x, y);
            Draw.color();
            Draw.blend();
        }
    }
}


    
