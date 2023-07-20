package dev.siro256.forgemod.killcheckglerror.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = Minecraft.class)
public abstract class MixinMinecraft {
    /**
     * @reason glGetError is a very slow method and should not be enabled in release build.
     * @author Siro_256
     * @param message Occurrence point identifier, but not used.
     */

    @Overwrite
    private void checkGLError(String message) {
        //Do nothing
    }
}
