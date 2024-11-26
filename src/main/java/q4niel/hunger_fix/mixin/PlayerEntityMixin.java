package q4niel.hunger_fix.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject (
            method = "addExhaustion(F)V",
            at = @At("HEAD"),
            cancellable = true
    )
    void addExhaustion(float exhaustion, CallbackInfo ci) {
        ci.cancel();
    }
}