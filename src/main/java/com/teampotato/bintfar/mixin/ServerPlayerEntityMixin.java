package com.teampotato.bintfar.mixin;

import net.minecraft.entity.player.ServerPlayerEntity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin {
    @Inject(method = "bedInRange", at = @At("HEAD"), cancellable = true)
    private void onCheckBed(@NotNull CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
