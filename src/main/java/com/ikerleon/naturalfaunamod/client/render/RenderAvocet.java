package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCourser;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAvocet extends RenderLivingZAWA<EntityAvocet> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/avocet/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/avocet/child_texture.png");

	public RenderAvocet(RenderManager rm) {
		super(rm, new ModelCourser(), 0.4F);
	}
	
	
	
    protected ResourceLocation getEntityTexture(EntityAvocet entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(entity.getAnimalType());
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
		}
	}
	
	public ResourceLocation getTextureOfVarChild(int varient) {
		switch (varient) {
			case 0:
			default:
				return texturechild;
		}
	}

    public static class RenderFactory implements IRenderFactory<EntityAvocet>{
	@Override
	public Render<? super EntityAvocet> createRenderFor(RenderManager manager) {
		return new RenderAvocet(manager);
	    }
    }
}