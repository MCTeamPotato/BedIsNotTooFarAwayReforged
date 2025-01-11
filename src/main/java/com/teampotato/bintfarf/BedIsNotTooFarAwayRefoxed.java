package com.teampotato.bintfarf;


import com.teampotato.bintfarf.config.BedSleepConfig;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.CanPlayerSleepEvent;

@Mod("bintfarf")
public class BedIsNotTooFarAwayRefoxed {

    public BedIsNotTooFarAwayRefoxed(ModContainer modContainer) // invoked by forge due to @Mod
    {
        modContainer.registerConfig(ModConfig.Type.COMMON, BedSleepConfig.SPEC);
        NeoForge.EVENT_BUS.addListener(EventPriority.LOWEST, this::onCanPlayerSleep);
    }

    void onCanPlayerSleep(CanPlayerSleepEvent event)
    {
        if (event.getProblem() != Player.BedSleepingProblem.NOT_SAFE)
            return;
        if (BedSleepConfig.canSleepWithMonsterAround.get()) event.setProblem(null);

    }


}
