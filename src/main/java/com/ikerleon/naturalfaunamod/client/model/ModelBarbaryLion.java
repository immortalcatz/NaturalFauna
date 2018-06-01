package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Barbary Lion - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelBarbaryLion extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape2_1;
    public ModelRenderer shape4;
    public ModelRenderer shape4_1;
    public ModelRenderer shape6;
    public ModelRenderer shape11;
    public ModelRenderer shape2_2;
    public ModelRenderer shape3;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape9_1;
    public ModelRenderer shape12;
    public ModelRenderer shape1_1;

    public ModelBarbaryLion() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape9_1 = new ModelRenderer(this, 40, 0);
        this.shape9_1.setRotationPoint(5.0F, -1.1F, 2.9F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape2_2 = new ModelRenderer(this, 9, 25);
        this.shape2_2.setRotationPoint(-1.0F, -2.0F, -3.5F);
        this.shape2_2.addBox(0.0F, 0.0F, 0.0F, 9, 11, 11, 0.0F);
        this.setRotateAngle(shape2_2, -0.091106186954104F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 55, 0);
        this.shape11.setRotationPoint(2.4F, 0.8F, 15.1F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.31869712141416456F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(-0.2F, 5.7F, 0.3F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 49, 33);
        this.shape1_1.setRotationPoint(-0.5F, 4.6F, -0.5F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape1_1, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 38, 26);
        this.shape8.setRotationPoint(1.3F, 2.0F, -2.4F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.5F, 8.3F, -7.3F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 17, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 25);
        this.shape6.setRotationPoint(0.9F, -0.3F, -2.3F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape9 = new ModelRenderer(this, 9, 0);
        this.shape9.setRotationPoint(-1.2F, -1.1F, 2.9F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape12 = new ModelRenderer(this, 52, 26);
        this.shape12.setRotationPoint(0.0F, 8.8F, 0.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.5009094953223726F, 0.0F, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 31, 0);
        this.shape2_1.setRotationPoint(4.2F, 5.7F, 0.3F);
        this.shape2_1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 47);
        this.shape3.setRotationPoint(-0.6F, 6.2F, 6.3F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 8, 3, 8, 0.0F);
        this.setRotateAngle(shape3, 0.091106186954104F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 43, 0);
        this.shape4.setRotationPoint(-0.2F, 5.7F, 13.9F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape7 = new ModelRenderer(this, 32, 47);
        this.shape7.setRotationPoint(-0.4F, 0.7F, -4.6F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape7, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 48, 13);
        this.shape4_1.setRotationPoint(4.2F, 5.7F, 13.9F);
        this.shape4_1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape7.addChild(this.shape9_1);
        this.shape1.addChild(this.shape2_2);
        this.shape1.addChild(this.shape11);
        this.shape1.addChild(this.shape2);
        this.shape12.addChild(this.shape1_1);
        this.shape7.addChild(this.shape8);
        this.shape1.addChild(this.shape6);
        this.shape7.addChild(this.shape9);
        this.shape11.addChild(this.shape12);
        this.shape1.addChild(this.shape2_1);
        this.shape1.addChild(this.shape3);
        this.shape1.addChild(this.shape4);
        this.shape6.addChild(this.shape7);
        this.shape1.addChild(this.shape4_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    float scaleFactor= 1.4F;
    	
    	GlStateManager.pushMatrix();
    	GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.shape1.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}