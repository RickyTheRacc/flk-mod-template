@file:Mixin(MinecraftClient::class)
@file:Name("MixinStatic")

package fabric.kotlin.template.mixin

import jdk.jfr.Name
import net.minecraft.client.MinecraftClient
import net.minecraft.util.crash.CrashReport
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject

@Inject(at = [At("HEAD")], method = ["Lnet/minecraft/client/MinecraftClient;printCrashReport(Lnet/minecraft/util/crash/CrashReport;)V"])
fun printCrashReport(report: CrashReport) {
    // This is an example of a mixin to a static Java method
}
