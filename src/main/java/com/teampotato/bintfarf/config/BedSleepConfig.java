package com.teampotato.bintfarf.config;

import net.neoforged.neoforge.common.ModConfigSpec;


public class BedSleepConfig
{
    public static final ModConfigSpec SPEC;
    public static ModConfigSpec.BooleanValue canSleepWithMonsterAround;

    static
    {
        ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
        BUILDER.push("Bed Is Not Too Far Away or Too Dangerous Config");

        canSleepWithMonsterAround =BUILDER
                .define("Can Player Sleep with Monsters Around?", false);

        SPEC = BUILDER.build();
    }


}