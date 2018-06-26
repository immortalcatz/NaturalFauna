package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGreySeal extends RenderLivingZAWA<EntityGreySeal> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/greyseal/texture.png");

	public RenderGreySeal(RenderManager rm) {
		super(rm, new ModelGreySeal(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityGreySeal entity)
    {
    		return getTextureOfVar(entity.getAnimalType());
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityGreySeal>{
	@Override
	public Render<? super EntityGreySeal> createRenderFor(RenderManager manager) {
		return new RenderGreySeal(manager);
	    }
    }
}

