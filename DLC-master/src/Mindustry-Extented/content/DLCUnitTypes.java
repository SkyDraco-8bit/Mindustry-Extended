package main.content;

import arc.Core;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.UnitTypes;
import mindustry.ctype.ContentList;
import mindustry.entities.abilities.MoveLightningAbility;
import mindustry.entities.abilities.UnitSpawnAbility;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.content.StatusEffects;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.type.ammo.PowerAmmoType;
import mindustry.world.meta.BlockFlag;


public class DLCUnitTypes implements ContentList {

    public static UnitType testworm;

    @Override
    public void load() {
        testworm = new UnitType("testworm") {{

            health = 320;
            speed = 2.2f;
            rotateSpeed = 1f;
            constructor = LegsUnit::new;

        }};
    };
}