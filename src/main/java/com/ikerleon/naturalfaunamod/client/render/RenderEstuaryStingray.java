package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelStingray;
import com.ikerleon.naturalfaunamod.entity.EntityEstuaryStingray;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEstuaryStingray extends RenderLivingZAWA<EntityEstuaryStingray> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ray/texture.png");

	public RenderEstuaryStingray(RenderManager rm) {
		super(rm, new ModelStingray(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityEstuaryStingray entity)
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
	
    public static class RenderFactory implements IRenderFactory<EntityEstuaryStingray>{
	@Override
	public Render<? super EntityEstuaryStingray> createRenderFor(RenderManager manager) {
		return new RenderEstuaryStingray(manager);
	    }
    }
}
