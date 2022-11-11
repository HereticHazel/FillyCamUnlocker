package com.tpow2.fillycamunlocker.mixin;

import com.minelittlepony.client.GuiPonySettings;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@SuppressWarnings({"ParameterCanBeLocal", "UnusedAssignment"})
@Mixin(GuiPonySettings.class)
public abstract class UnlockerMixin {
	@ModifyVariable(method = "rebuildContent", at = @At(value = "FIELD", target = "Lcom/minelittlepony/client/GuiPonySettings;hiddenOptions:Z", opcode = Opcodes.GETFIELD, ordinal = 0))
	private boolean injected(boolean allowCameraChange) {
		return allowCameraChange = true;
	}
}
