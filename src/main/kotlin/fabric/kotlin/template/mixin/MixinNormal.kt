package fabric.kotlin.template.mixin

import net.minecraft.client.gui.screen.TitleScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject

@Mixin(TitleScreen::class, remap = true)
class MixinNormal {
    // Most people will say to write your mixins in Java. Most people are wrong!
    // ModMuss will cope about this, but all mixins should be written in Kotlin

    @Inject(at = [At("HEAD")], method = ["init()V"])
    fun normalMixinExample() {
        // This is an example of a mixin to a non-static Java method
    }
}