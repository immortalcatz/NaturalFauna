package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBarbaryLion extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape2_1;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape4_1;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape2_2;
    public AdvancedModelRenderer shape3;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape1_1;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape9_1;

    public ModelBarbaryLion() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape9 = new AdvancedModelRenderer(this, 9, 0);
        this.shape9.setRotationPoint(-2.2F, -2.2F, -2.8F);
        this.shape9.addBox(-2.0F, -2.0F, -0.1F, 2, 2, 1, 0.0F);
        this.shape2_1 = new AdvancedModelRenderer(this, 31, 0);
        this.shape2_1.setRotationPoint(5.7F, 5.7F, 1.8F);
        this.shape2_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape4_1 = new AdvancedModelRenderer(this, 48, 13);
        this.shape4_1.setRotationPoint(5.7F, 5.8F, 15.4F);
        this.shape4_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 52, 26);
        this.shape12.setRotationPoint(0.0F, 8.4F, 0.3F);
        this.shape12.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.6829473363053812F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 38, 26);
        this.shape8.setRotationPoint(-2.0F, -1.2F, -5.9F);
        this.shape8.addBox(0.0F, 0.0F, -2.6F, 4, 4, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 32, 47);
        this.shape7.setRotationPoint(2.5F, 3.8F, -3.4F);
        this.shape7.addBox(-3.0F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape7, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 0, 25);
        this.shape6.setRotationPoint(-2.4F, 1.7F, -3.6F);
        this.shape6.addBox(0.0F, 0.0F, -5.7F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.091106186954104F, 0.0F, 0.0F);
        this.shape2_2 = new AdvancedModelRenderer(this, 9, 25);
        this.shape2_2.setRotationPoint(3.4F, -1.6F, 5.5F);
        this.shape2_2.addBox(-4.4F, 0.0F, -10.3F, 9, 11, 11, 0.0F);
        this.setRotateAngle(shape2_2, -0.091106186954104F, 0.0F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.3F, 5.7F, 1.8F);
        this.shape2.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 43, 0);
        this.shape4.setRotationPoint(1.4F, 5.7F, 15.4F);
        this.shape4.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape9_1 = new AdvancedModelRenderer(this, 40, 0);
        this.shape9_1.setRotationPoint(2.1F, -2.2F, -2.8F);
        this.shape9_1.addBox(0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape1_1 = new AdvancedModelRenderer(this, 49, 33);
        this.shape1_1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.shape1_1.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape1_1, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.5F, 8.3F, -7.3F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 17, 0.0F);
        this.shape3 = new AdvancedModelRenderer(this, 0, 47);
        this.shape3.setRotationPoint(-0.6F, 6.2F, 4.9F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 8, 3, 8, 0.0F);
        this.setRotateAngle(shape3, 0.091106186954104F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 55, 0);
        this.shape11.setRotationPoint(3.5F, 1.1F, 15.6F);
        this.shape11.addBox(-1.0F, 0.0F, -0.5F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.40980330836826856F, 0.0F, 0.0F);
        this.shape7.addChild(this.shape9);
        this.shape1.addChild(this.shape2_1);
        this.shape1.addChild(this.shape4_1);
        this.shape11.addChild(this.shape12);
        this.shape7.addChild(this.shape8);
        this.shape6.addChild(this.shape7);
        this.shape2_2.addChild(this.shape6);
        this.shape1.addChild(this.shape2_2);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape4);
        this.shape7.addChild(this.shape9_1);
        this.shape12.addChild(this.shape1_1);
        this.shape1.addChild(this.shape3);
        this.shape1.addChild(this.shape11);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
     	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     	
     	if(this.isChild) {
     		float scaleFactor= 0.5F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape1.render(f5);
    	    GlStateManager.popMatrix();
     	}
     	else {
            float scaleFactor= 1.3F;
        	
        	GlStateManager.pushMatrix();
        	GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
        	GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.shape1.render(f5);
            GlStateManager.popMatrix();
     	}
    }
    
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();

    	float globalSpeed = 2f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.3F;
    	
        this.shape7.rotateAngleY = (f3 * 0.017453292F);
        this.shape7.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(shape1, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape2, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape2_1, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape4, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape4_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape2, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape2_2, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape1_1, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	
    	flap(shape11, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	flap(shape12, 0.15f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
